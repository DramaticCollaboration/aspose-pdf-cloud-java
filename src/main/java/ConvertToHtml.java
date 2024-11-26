import java.io.File;
import java.io.IOException;
import java.util.List;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.model.FilesUploadResult;
import com.aspose.asposecloudpdf.model.PartsEmbeddingModes;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

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
        Boolean splitIntoPages = true;
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
        String appSid = args[0];
        String appKey = args[1];
        String from = args[2];
        String to = args[3];

        toHtml(appKey, appSid, from, to);

    }


}
