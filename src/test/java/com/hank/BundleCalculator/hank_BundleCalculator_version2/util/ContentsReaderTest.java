package com.hank.BundleCalculator.hank_BundleCalculator_version2.util;

import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class ContentsReaderTest {
    private ContentsReader contentsReader;


    @Before
    public void setUp() throws Exception {
        contentsReader = new ContentsReader();
    }

    @Test
    public void contentsRead() {
        List<String> contents = contentsReader.contentsRead("input_file.txt");
        List<String> contentsAssert = Arrays.asList("10 IMG", "15 FLAC", "13 VID");
        assertEquals(contentsAssert,contents);
    }
}