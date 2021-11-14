package guru.qa.distll;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class ReadySuite {

    int volumeAlembic;
    int heightSideBar;
    int volumeRefrigerator;

    public ReadySuite() {

    }

    public int getVolumeAlembic() {
        return volumeAlembic;
    }

    public int getHeightSideBar() {
        return heightSideBar;
    }

    public int getVolumeRefrigerator() {
        return volumeRefrigerator;
    }

    public List<ReadySuite> getReadySuite() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(getClass().getClassLoader().getResourceAsStream("suites.json"),
                new TypeReference<List<ReadySuite>>(){});
    }
}
