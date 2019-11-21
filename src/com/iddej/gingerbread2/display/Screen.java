package com.iddej.gingerbread2.display;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.iddej.gingerbread2.logging.GlobalLogger;
import com.iddej.gingerbread2.logging.GlobalLogger.LogLevel;

public final class Screen {
	private static final int DEFAULT_ORIGIN_X = 0, DEFAULT_ORIGIN_Y = 0;

	private static Graphics graphics;

	private Screen() {
		return;
	}

	public static final void setGraphics(final Graphics graphics) {
		Screen.graphics = graphics;
	}

	public static final Graphics getGraphics() {
		return Screen.graphics;
	}

	public static final void clear(final Window window) {
		if (Screen.graphics == null) {
			GlobalLogger.log(Screen.class, LogLevel.ERROR, "Tried to use a Screen method without first setting the graphics!");
			return;
		}
		Screen.graphics.setColor(Color.BLACK);
		Screen.graphics.fillRect(Screen.DEFAULT_ORIGIN_X, Screen.DEFAULT_ORIGIN_Y, window.getWidth(), window.getHeight());
	}

	public static final void drawSprite(final BufferedImage image, final int x, final int y, final int width, final int height) {
		if (Screen.graphics == null) {
			GlobalLogger.log(Screen.class, LogLevel.ERROR, "Tried to use a Screen method without first setting the graphics!");
			return;
		}
		Screen.graphics.drawImage(image, x, y, width, height, null);
	}
}
