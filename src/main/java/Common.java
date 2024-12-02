
import java.io.File;
import java.util.UUID;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.model.FilesUploadResult;
import org.apache.commons.io.FilenameUtils;

public class Common {

    public static String uploadFile(PdfApi pdfApi, String name) throws ApiException {
        String folder = UUID.randomUUID().toString();
        File file = new File(name);
        String path = "aaa/" + FilenameUtils.getName(name);
        FilesUploadResult result =  pdfApi.uploadFile(path, file, null);
        return "aaa";
    }
}