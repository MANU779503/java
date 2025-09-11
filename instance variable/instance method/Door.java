public class Door {
    public int panels = 2;
    public String doorColor = "white";
    public boolean isLocked = true;
    public char style = 'F';  // ‘F’ for French, ‘S’ for Standard
    public long area = 2500L;
    public float thickness = 4.5f;
    public double frameDepth = 2.75;

    public int getPanels() {
        System.out.println("Number of panels = " + panels);
        return panels;
    }
    public String getDoorColor() {
        System.out.println("Door color = " + doorColor);
        return doorColor;
    }
    public boolean getIsLocked() {
        System.out.println("Door locked = " + isLocked);
        return isLocked;
    }
    public char getStyle() {
        System.out.println("Style code = " + style);
        return style;
    }
    public long getArea() {
        System.out.println("Door area = " + area);
        return area;
    }
    public float getThickness() {
        System.out.println("Thickness = " + thickness);
        return thickness;
    }
    public double getFrameDepth() {
        System.out.println("Frame depth = " + frameDepth);
        return frameDepth;
    }
}
