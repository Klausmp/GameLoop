package graphics;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public enum Texture {
    ;

    /**
     * EXAMPEL(TextureLoader.getExampel());
     */

    public BufferedImage texture;

    Texture(BufferedImage texture) {
        setTexture(texture);
    }

    public BufferedImage getTexture() {
        //System.out.println("used");
        return texture;
    }

    public void setTexture(BufferedImage texture) {
        this.texture = texture;
    }

    public static class TextureLoader {
        //public static BufferedImage  texture names;

        public static void loadTextures() {
        /*
            try {
                //Load the pictures
                //setExampel(ImageIO.read(Objects.requireNonNull(Window.class.getClassLoader().getResourceAsStream("gfx/Exampel.png"))));
                //Cut textures and set them
                //setExampel(getSkin().getSubimage(0, 0, WIGHT, HEIGHT));
            } catch (IOException e) {
                e.printStackTrace();
            }
        */
        }
    }
}