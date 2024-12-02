import java.io.File;
import java.io.IOException;
import java.util.List;

import cn.hutool.core.io.FileUtil;
import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.model.FilesUploadResult;
import com.aspose.asposecloudpdf.model.PartsEmbeddingModes;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.commons.lang3.StringUtils;

public class ConvertToHtml {
    public static void toHtml(String appKey, String appSid, String from, String to) throws ApiException, IOException {
    	PdfApi pdfApi = new PdfApi(appKey, appSid);
        String name = from;

        Integer additionalMarginWidthInPoints = null;
        Boolean compressSvgGraphicsIfAny = null;
        Boolean convertMarkedContentToLayers = null;
        String defaultFontName = null;
        String documentType = null;
        Boolean fixedLayout = null;
        Integer imageResolution = null;
        Integer minimalLineWidth = null;
        Boolean preventGlyphsGrouping = null;
        Boolean splitCssIntoPages = false;
        Boolean splitIntoPages = false;
        Boolean useZOrder = null;
        String antialiasingProcessing = null;
        String cssClassNamesPrefix = null;
        List<Integer> explicitListOfSavedPages = null;
        String fontEncodingStrategy = null;
        String fontSavingMode = null;
        String htmlMarkupGenerationMode = null;
        String lettersPositioningMethod = null;
        Boolean pagesFlowTypeDependsOnViewersScreenSize = null;
        String partsEmbeddingMode = PartsEmbeddingModes.EMBEDALLINTOHTML.getValue();
        String rasterImagesSavingMode = null;
        Boolean removeEmptyAreasOnTopAndBottom = null;
        Boolean saveShadowedTextsAsTransparentTexts = null;
        Boolean saveTransparentTexts = null;
        String specialFolderForAllImages = null;
        String specialFolderForSvgImages = null;
        Boolean trySaveTextUnderliningAndStrikeoutingInCss = null;

        String folder = Common.uploadFile(pdfApi,name);
        String storage = "PDF2HTML";
        Boolean flowLayoutParagraphFullWidth = null;

        File file = pdfApi.getPdfInStorageToHtml(
            FilenameUtils.getName(name),
            additionalMarginWidthInPoints,
            compressSvgGraphicsIfAny,
            convertMarkedContentToLayers,
            defaultFontName,
            documentType,
            fixedLayout,
            imageResolution,
            minimalLineWidth,
            preventGlyphsGrouping,
            splitCssIntoPages,
            splitIntoPages,
            useZOrder,
            antialiasingProcessing,
            cssClassNamesPrefix,
            explicitListOfSavedPages,
            fontEncodingStrategy,
            fontSavingMode,
            htmlMarkupGenerationMode,
            lettersPositioningMethod,
            pagesFlowTypeDependsOnViewersScreenSize,
            partsEmbeddingMode,
            rasterImagesSavingMode,
            removeEmptyAreasOnTopAndBottom,
            saveShadowedTextsAsTransparentTexts,
            saveTransparentTexts,
            specialFolderForAllImages,
            specialFolderForSvgImages,
            trySaveTextUnderliningAndStrikeoutingInCss,
            folder,
            storage,
            flowLayoutParagraphFullWidth
        );
        FileUtils.moveToDirectory(file, new File(to), true);
    }

    public static void main(String args[]) throws ApiException, IOException {
        /*
        String appSid = args[0];
        String appKey = args[1];
        String from = args[2];
        String to = args[3];
         */

        String  appKey = "51306b086ec88f74cd9703025a780b93";
        String appSid = "4d342d73-e219-4a6c-88e9-1a4e78b6b2fd";
        File bookDataDir = new File("/home/poh/projects/clbee/data/book/aidt/2536/data");
        File targetDir = new File("/home/poh/projects/clbee/data/target/aidt/2536/assets");


        List<File> fileList = (List<File>) FileUtils.listFiles(bookDataDir, new IOFileFilter() {
            @Override
            public boolean accept(File file) {
                return accept(file, file.getName());
            }

            @Override
            public boolean accept(File file, String name) {
                return StringUtils.contains(file.getAbsolutePath(), "data") && StringUtils.endsWith(name, ".pdf");
            }
        }, TrueFileFilter.INSTANCE);


        for(File file : fileList) {
            File to = FileUtil.file(targetDir, FilenameUtils.getBaseName(file.getName()), FilenameUtils.getBaseName(file.getName()) + ".html");


            System.out.println("from : to");
            System.out.println(file.getAbsolutePath() +":"+ to.getAbsolutePath());
            toHtml(appKey, appSid, file.getAbsolutePath(), to.getAbsolutePath());
        }


    }


}
