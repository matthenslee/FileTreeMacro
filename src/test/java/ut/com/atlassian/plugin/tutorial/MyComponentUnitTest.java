package ut.com.atlassian.plugin.tutorial;

import org.junit.Test;
import com.atlassian.plugin.tutorial.api.MyPluginComponent;
import com.atlassian.plugin.tutorial.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}