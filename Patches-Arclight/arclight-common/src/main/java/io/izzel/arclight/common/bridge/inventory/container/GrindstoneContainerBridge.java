package io.izzel.arclight.common.bridge.inventory.container;

import net.minecraft.util.IWorldPosCallable;

public interface GrindstoneContainerBridge extends ContainerBridge {

    IWorldPosCallable bridge$getContainerAccess();
}
