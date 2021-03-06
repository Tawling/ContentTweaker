package com.teamacronymcoders.contenttweaker.modules.materials.materials;

import com.teamacronymcoders.contenttweaker.modules.materials.materialparts.IMaterialPart;
import com.teamacronymcoders.contenttweaker.modules.materials.parts.IPart;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

import java.util.List;

@ZenClass("mods.contenttweaker.Material")
public interface IMaterial {
    @ZenMethod
    String getName();

    @ZenMethod
    int getColor();

    @ZenMethod
    boolean isHasEffect();

    @ZenMethod
    String getUnlocalizedName();

    @ZenMethod
    List<IMaterialPart> registerParts(String[] partNames);

    @ZenMethod
    List<IMaterialPart> registerParts(IPart[] parts);

    @ZenMethod
    IMaterialPart registerPart(String partName);

    @ZenMethod
    IMaterialPart registerPart(IPart part);
}
