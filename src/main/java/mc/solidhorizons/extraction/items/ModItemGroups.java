package mc.solidhorizons.extraction.items;

import mc.solidhorizons.extraction.Extraction;
import mc.solidhorizons.extraction.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    //extractions item group ------------------------
    public static final ItemGroup EXTRACTION_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Extraction.MOD_ID, "extraction"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.extraction"))
                    .icon(() -> new ItemStack(ModItems.PROPITAL)).entries((displayContext, entries) -> {

                        //items
                        entries.add(ModItems.PROPITAL);

                        //blocks
                        entries.add(ModBlocks.RUSTED_ORE);

                    }).build());

    //itemgroup functions ------------------------
    public static void registerItemGroups(){
        Extraction.LOGGER.info("Registering Item Groups for " + Extraction.MOD_ID);
    }
}
