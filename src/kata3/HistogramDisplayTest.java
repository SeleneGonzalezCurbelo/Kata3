package kata3;

import org.jfree.data.category.DefaultCategoryDataset;
import static org.junit.Assert.*;

import org.junit.Test;

public class HistogramDisplayTest {

    @Test
    public void testCreateDataSet() {
        Histogram<String> histogram = new Histogram<>();
        histogram.increment("example.com");
        histogram.increment("example.com");
        histogram.increment("example.org");
        histogram.increment("example.net");

        HistogramDisplay display = new HistogramDisplay(histogram);
        DefaultCategoryDataset dataSet = display.createDataSet();

        assertEquals("Incorrect value for example.com", 2, dataSet.getValue("", "example.com").intValue());
        assertEquals("Incorrect value for example.org", 1, dataSet.getValue("", "example.org").intValue());
        assertEquals("Incorrect value for example.net", 1, dataSet.getValue("", "example.net").intValue());
    }
}
