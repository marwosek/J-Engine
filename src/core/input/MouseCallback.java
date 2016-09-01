package core.input;

import org.lwjgl.glfw.*;

public class MouseCallback implements GLFWMouseButtonCallbackI
{
    @Override
    public void invoke(long window, int button, int action, int mods)
    {
        System.out.println("Works!");
    }
}
