package edu;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.graal.ImmutablePDGGenerator;
import edu.graal.PDGGenerator;

import edu.graal.graphs.PDGraph;
import edu.graal.graphs.types.PDGEdge;
import edu.graal.graphs.types.PDGVertex;
import javaslang.Tuple;
import javaslang.Tuple2;
import javaslang.jackson.datatype.JavaslangModule;
import org.jgrapht.DirectedGraph;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Set;

public class GenerateGraph {
    private static final PDGGenerator pdgGenerator = ImmutablePDGGenerator.of();
    private static final ObjectMapper mapper = new ObjectMapper();

    public static String convertToJson(PDGraph pdGraph) throws JsonProcessingException {
        DirectedGraph<PDGVertex, PDGEdge> directedGraph = pdGraph.getDefaultGraph();
        Tuple2<Set<PDGVertex>, Set<PDGEdge>> graph = Tuple.of(directedGraph.vertexSet(), directedGraph.edgeSet());
        return convertToJson(graph);
    }

    public static String convertToJson(Object object) throws JsonProcessingException {
        return mapper.writeValueAsString(object);
    }

    private static void make_file(String readfile, String writefile){
        try {
            BufferedReader myReader = new BufferedReader(new FileReader(readfile));
            BufferedWriter myWriter = new BufferedWriter(new FileWriter(writefile));
            String line;
            while ((line = myReader.readLine()) != null) {
                if (line.length() > 10000) {
                    myWriter.write("Method too long\n");
                    myWriter.flush();
                    continue;
                }
                try {
                    PDGraph pdGraph = pdgGenerator.createPDG(line, 0);
                    String json = convertToJson(pdGraph);
                    pdGraph = null;
                    myWriter.write(json+"\n");
                    myWriter.flush();
                } catch (NullPointerException e){
                    myWriter.write("NullPointerException\n");
                    myWriter.flush();
                } catch (NoSuchElementException ex){
                    myWriter.write("NoSuchElementException\n");
                    myWriter.flush();
                }
            }
            myWriter.close();
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        mapper.registerModule(new JavaslangModule());
        String path = "C:\\Users\\workshop\\IdeaProjects\\GRAAL\\src\\main\\java\\edu\\";
        File folder = new File(path+"data");
        File[] listOfFiles = folder.listFiles();
        assert listOfFiles != null;
        for (File file : listOfFiles) {
            make_file(path+"data\\"+file.getName(), path+"out_data\\"+file.getName());
            if (file.renameTo(new File(path+"processed_data\\"+file.getName()))){
                System.out.println(file.getName()+" processed");
            }
        }
    }
}
