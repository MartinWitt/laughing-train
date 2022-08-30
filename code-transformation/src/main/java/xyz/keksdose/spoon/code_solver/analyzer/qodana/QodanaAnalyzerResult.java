package xyz.keksdose.spoon.code_solver.analyzer.qodana;

import com.contrastsecurity.sarif.Region;
import com.contrastsecurity.sarif.Result;

public record QodanaAnalyzerResult(
        String ruleID, String filePath, Position position, String message, String messageMarkdown, String snippet)
        implements AnalyzerResult {

    public QodanaAnalyzerResult(Result result) {
        this(
                result.getRuleId(),
                getFilePathFromResult(result),
                fromResult(result),
                result.getMessage().getText(),
                result.getMessage().getMarkdown(),
                regionFromResult(result));
    }

    private static String getFilePathFromResult(Result result) {
        return result.getLocations()
                .get(0)
                .getPhysicalLocation()
                .getArtifactLocation()
                .getUri();
    }

    private static String regionFromResult(Result result) {
        return result.getLocations()
                .get(0)
                .getPhysicalLocation()
                .getContextRegion()
                .getSnippet()
                .getText();
    }

    private static Position fromResult(Result result) {
        Region region = result.getLocations().get(0).getPhysicalLocation().getRegion();
        return new Position(
                nullToZero(region.getStartLine()),
                nullToZero(region.getEndLine()),
                nullToZero(region.getStartColumn()),
                nullToZero(region.getEndColumn()),
                nullToZero(region.getCharOffset()),
                nullToZero(region.getCharLength()));
    }

    private static int nullToZero(Integer value) {
        return value == null ? 0 : value;
    }

    public String getAnalyzer() {
        return "Qodana";
    }
}
