package com.filestack.model.transform.tasks.rotate;

import static org.junit.Assert.assertTrue;

import com.filestack.model.transform.base.TransformTask;
import org.junit.Test;

public class TestRotateTask {

  @Test
  public void testToString() {
    String correct = "rotate="
        + "deg:90,"
        + "exif:false,"
        + "background:white";

    TransformTask task = new RotateTask.Builder()
        .deg(90)
        .exif(false)
        .background("white")
        .build();

    String output = task.toString();

    String message = String.format("Task string malformed\nCorrect: %s\nOutput: %s",
        correct, output);
    assertTrue(message, output.equals(correct));
  }

  @Test
  public void testToStringDegExif() {
    String correct = "rotate="
        + "deg:exif,"
        + "exif:false,"
        + "background:white";

    TransformTask task = new RotateTask.Builder()
        .deg("exif")
        .exif(false)
        .background("white")
        .build();

    String output = task.toString();

    String message = String.format("Task string malformed\nCorrect: %s\nOutput: %s",
        correct, output);
    assertTrue(message, output.equals(correct));
  }
}
