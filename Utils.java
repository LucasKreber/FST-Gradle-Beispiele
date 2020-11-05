import org.apache.commons.io.FilenameUtils;

public class Utils {

    public String getFullPath(String str) {
        return FilenameUtils.getFullPath(str);
    }

}