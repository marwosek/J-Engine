package core.input;

import org.lwjgl.glfw.*;

public class KeyCallback implements GLFWKeyCallbackI
{
    @Override
    public void invoke(long window, int key, int scancode, int action, int mods)
    {
        if(action == GLFW.GLFW_PRESS)
        {
            System.out.println(String.valueOf((char)key));
        }
    }
}
