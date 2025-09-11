public class Window {
    public int windowCount = 4;
    public String windowType = "sliding";
    public boolean isOpen = false;
    public char material = 'G';  // ‘G’ for Glass, ‘P’ for Plastic
    public long width = 1200L;
    public float transparency = 0.85f;
    public double height = 1.5;

    public int getWindowCount() {
        System.out.println("Window count = " + windowCount);
        return windowCount;
    }
    public String getWindowType() {
        System.out.println("Window type = " + windowType);
        return windowType;
    }
    public boolean getIsOpen() {
        System.out.println("Is window open = " + isOpen);
        return isOpen;
    }
    public char getMaterial() {
        System.out.println("Material code = " + material);
        return material;
    }
    public long getWidth() {
        System.out.println("Window width = " + width);
        return width;
    }
    public float getTransparency() {
        System.out.println("Transparency = " + transparency);
        return transparency;
    }
    public double getHeight() {
        System.out.println("Height = " + height);
        return height;
    }
}
