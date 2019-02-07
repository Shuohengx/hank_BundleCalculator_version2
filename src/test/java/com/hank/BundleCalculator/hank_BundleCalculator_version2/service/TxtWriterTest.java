package com.hank.BundleCalculator.hank_BundleCalculator_version2.service;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class TxtWriterTest {
    TxtWriter txtWriter;

    @Before
    public void setUp() throws Exception {
        txtWriter = new TxtWriter();
    }

    @Test
    public void write() throws IOException {

        txtWriter.write("output_file");
    }
}