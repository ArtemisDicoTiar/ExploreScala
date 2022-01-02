package org.john.chapter9

class RGBColor(val color: Int) {
  def hex = f"$color%06X"
}

trait Opaque extends RGBColor {
  override def hex: String = s"${super.hex}FF"
}

trait Sheer extends RGBColor {
  override def hex: String = s"${super.hex}33"
}

class Paint(color: Int) extends RGBColor(color) with Opaque

class Overlay(color: Int) extends RGBColor(color) with Sheer
