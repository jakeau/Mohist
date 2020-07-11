package red.mohist.bukkit.nms.proxy;

import java.lang.invoke.MethodType;
import red.mohist.bukkit.nms.utils.RemapUtils;

/**
 *
 * @author pyz
 * @date 2019/7/1 7:38 PM
 */
public class ProxyMethodType {
    public static MethodType fromMethodDescriptorString(String descriptor, ClassLoader classLoader) throws IllegalArgumentException, TypeNotPresentException {
        return MethodType.fromMethodDescriptorString(RemapUtils.remapMethodDesc(descriptor), classLoader);
    }
}
