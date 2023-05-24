import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class FileGenerator {
    public void jsonSave(Address address) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        FileWriter fw = new FileWriter(address.cep() + ".json");

        fw.write(gson.toJson(address));

        fw.close();
    }
}
