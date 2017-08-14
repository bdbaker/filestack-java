package com.filestack.model.transform.tasks.filters;

import com.filestack.model.transform.base.ImageTransformTask;

public class PixelateTask extends ImageTransformTask {

  // Constructor left public because this task can be used with default options
  public PixelateTask() {
    super("pixelate");
  }

  // Builder doesn't make sense for this task, there's only 1 option
  public PixelateTask(int amount) {
    super("pixelate");
    addOption("amount", amount);
  }
}
