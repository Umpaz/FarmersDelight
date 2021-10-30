package vectorwing.farmersdelight.registry;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.tile.*;

public class ModBlockEntityTypes
{
	public static final DeferredRegister<BlockEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, FarmersDelight.MODID);

	public static final RegistryObject<BlockEntityType<StoveBlockEntity>> STOVE_TILE = TILES.register("stove",
			() -> BlockEntityType.Builder.of(StoveBlockEntity::new, ModBlocks.STOVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<CookingPotBlockEntity>> COOKING_POT_TILE = TILES.register("cooking_pot",
			() -> BlockEntityType.Builder.of(CookingPotBlockEntity::new, ModBlocks.COOKING_POT.get()).build(null));
	public static final RegistryObject<BlockEntityType<BasketBlockEntity>> BASKET_TILE = TILES.register("basket",
			() -> BlockEntityType.Builder.of(BasketBlockEntity::new, ModBlocks.BASKET.get()).build(null));
	public static final RegistryObject<BlockEntityType<CuttingBoardBlockEntity>> CUTTING_BOARD_TILE = TILES.register("cutting_board",
			() -> BlockEntityType.Builder.of(CuttingBoardBlockEntity::new, ModBlocks.CUTTING_BOARD.get()).build(null));
	public static final RegistryObject<BlockEntityType<SkilletBlockEntity>> SKILLET_TILE = TILES.register("skillet",
			() -> BlockEntityType.Builder.of(SkilletBlockEntity::new, ModBlocks.SKILLET.get()).build(null));
	public static final RegistryObject<BlockEntityType<PantryBlockEntity>> PANTRY_TILE = TILES.register("pantry",
			() -> BlockEntityType.Builder.of(PantryBlockEntity::new,
							ModBlocks.OAK_PANTRY.get(), ModBlocks.BIRCH_PANTRY.get(), ModBlocks.SPRUCE_PANTRY.get(), ModBlocks.JUNGLE_PANTRY.get(), ModBlocks.ACACIA_PANTRY.get(), ModBlocks.DARK_OAK_PANTRY.get())
					.build(null));
	public static final RegistryObject<BlockEntityType<CanvasSignBlockEntity>> CANVAS_SIGN_TILE = TILES.register("canvas_sign",
			() -> BlockEntityType.Builder.of(CanvasSignBlockEntity::new,
							ModBlocks.CANVAS_SIGN.get(),
							ModBlocks.WHITE_CANVAS_SIGN.get(),
							ModBlocks.ORANGE_CANVAS_SIGN.get(),
							ModBlocks.MAGENTA_CANVAS_SIGN.get(),
							ModBlocks.LIGHT_BLUE_CANVAS_SIGN.get(),
							ModBlocks.YELLOW_CANVAS_SIGN.get(),
							ModBlocks.LIME_CANVAS_SIGN.get(),
							ModBlocks.PINK_CANVAS_SIGN.get(),
							ModBlocks.GRAY_CANVAS_SIGN.get(),
							ModBlocks.LIGHT_GRAY_CANVAS_SIGN.get(),
							ModBlocks.CYAN_CANVAS_SIGN.get(),
							ModBlocks.PURPLE_CANVAS_SIGN.get(),
							ModBlocks.BLUE_CANVAS_SIGN.get(),
							ModBlocks.BROWN_CANVAS_SIGN.get(),
							ModBlocks.GREEN_CANVAS_SIGN.get(),
							ModBlocks.RED_CANVAS_SIGN.get(),
							ModBlocks.BLACK_CANVAS_SIGN.get(),
							ModBlocks.CANVAS_WALL_SIGN.get(),
							ModBlocks.WHITE_CANVAS_WALL_SIGN.get(),
							ModBlocks.ORANGE_CANVAS_WALL_SIGN.get(),
							ModBlocks.MAGENTA_CANVAS_WALL_SIGN.get(),
							ModBlocks.LIGHT_BLUE_CANVAS_WALL_SIGN.get(),
							ModBlocks.YELLOW_CANVAS_WALL_SIGN.get(),
							ModBlocks.LIME_CANVAS_WALL_SIGN.get(),
							ModBlocks.PINK_CANVAS_WALL_SIGN.get(),
							ModBlocks.GRAY_CANVAS_WALL_SIGN.get(),
							ModBlocks.LIGHT_GRAY_CANVAS_WALL_SIGN.get(),
							ModBlocks.CYAN_CANVAS_WALL_SIGN.get(),
							ModBlocks.PURPLE_CANVAS_WALL_SIGN.get(),
							ModBlocks.BLUE_CANVAS_WALL_SIGN.get(),
							ModBlocks.BROWN_CANVAS_WALL_SIGN.get(),
							ModBlocks.GREEN_CANVAS_WALL_SIGN.get(),
							ModBlocks.RED_CANVAS_WALL_SIGN.get(),
							ModBlocks.BLACK_CANVAS_WALL_SIGN.get())
					.build(null));
}