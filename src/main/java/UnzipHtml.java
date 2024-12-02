import cn.hutool.core.io.FileUtil;
import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.model.PartsEmbeddingModes;
import net.lingala.zip4j.ZipFile;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class UnzipHtml {

    public static void main(String args[]) throws ApiException, IOException {
        /*
        String appSid = args[0];
        String appKey = args[1];
        String from = args[2];
        String to = args[3];
         */

        File bookDataDir = new File("/home/poh/projects/clbee/data/target/aidt/2536_aspose_original/2536/assets");


        List<File> fileList = (List<File>) FileUtils.listFiles(bookDataDir, new IOFileFilter() {
            @Override
            public boolean accept(File file) {
                return accept(file, file.getName());
            }

            @Override
            public boolean accept(File file, String name) {
                return StringUtils.endsWith(name, ".zip;");
            }
        }, TrueFileFilter.INSTANCE);


        for(File file : fileList) {
            ZipFile zipfile = new ZipFile(file);
            File parent = file.getParentFile();
            zipfile.extractAll(parent.getAbsolutePath());
            String htmlFile = parent.getName();
            File newParentPath = new File(parent.getAbsolutePath() + "AA");
            FileUtils.moveToDirectory(parent, newParentPath, true);

            File from = FileUtil.file(newParentPath, htmlFile, htmlFile);
            File to = FileUtil.file(parent.getParent(), htmlFile);

            try {
                FileUtils.moveFile(from, to);
                FileUtils.deleteQuietly(newParentPath);
            }catch (IOException e){
                e.printStackTrace();
            }

            System.out.println("from : to -> " + from.getAbsolutePath() +":" + to.getAbsolutePath());

        }


    }


}
