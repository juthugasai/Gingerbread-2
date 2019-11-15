package com.iddej.gingerbread2.util.floatingpoint;

public class Vector2F {
	private double x, y;

	public Vector2F(final double x, final double y) {
		this.x = x;
		this.y = y;
	}

	public Vector2F add(final Vector2F other) {
		return new Vector2F(this.x + other.x, this.y + other.y);
	}

	public Vector2F subtract(final Vector2F other) {
		return new Vector2F(this.x - other.x, this.y - other.y);
	}

	public Vector2F scale(final double scalar) {
		return new Vector2F(this.x * scalar, this.y * scalar);
	}

	public double dotProduct(final Vector2F other) {
		return (this.x * other.x) + (this.y * other.y);
	}

	public double length() {
		return Math.sqrt((this.x * this.x) + (this.y * this.y));
	}

	public Vector2F normalize() {
		return new Vector2F(this.x / this.length(), this.y / this.length());
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public void setX(final double x) {
		this.x = x;
	}

	public void setY(final double y) {
		this.y = y;
	}
}
