package pneumaticCraft.lib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.minecraft.util.EnumChatFormatting;
import pneumaticCraft.common.util.PneumaticCraftUtils;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiConstants{
    public static final int ANIMATED_STAT_SPEED = 10;
    public static final int maxCharPerLineLeft = 28;

    public static final float CHARGING_STATION_AIR_SPEED = 0.001F;

    public static final String UPGRADES_VOLUME_TEXT = "\u00a77-Volume Upgrade \n\u00a70Adds 1L more air capacity for each upgrade inserted.";
    public static final String UPGRADES_SECURITY_TEXT = "\u00a77-Security Upgrade \n\u00a70Adds a build-in Safety Valve Tube to the pneumatic machine.";

    // info texts
    public static final String INFO_AIR_CANNON = "\u00a70This machine can be used to transport items through the air." + " To be able to use it you'll have to make a GPS Tool. Once made, right click with it on the block you want the items to travel to, and insert the GPS Tool in the GPS slot.";
    public static final String INFO_PRESSURE_CHAMBER = "\u00a70This multi-block structure can be used as air storage. " + "The main feature however is to compress various materials into others. Like coal into diamonds.";
    public static final String INFO_AIR_COMPRESSOR = "\u00a70This machine is used to generate compressed air. To do this insert any " + "item that can burn in a Furnace in the fuel slot.";
    public static final String INFO_CHARGING_STATION = "\u00a70This machine is used to (dis)charge items which operate on pneumatic power, for instance a Vortex Cannon.";
    public static final String INFO_ELEVATOR = "\u00a70This machine is like the name says an elevator. You can use this to transport any entities. For it to work you'll need some air pressure and Elevator Frames on top of this block to support the elevator. To control the height level apply a redstone signal or use Elevator Callers. A redstone strength of 0 equals 0%% extension, a strength of 15 equals 100%% extension.";
    public static final String INFO_PNEUMATIC_HELMET = "\u00a70On its own this helmet is as good as an Iron Helmet. However, on this helmet you can install various upgrades.";
    public static final String INFO_PRESSURE_CHAMBER_INTERFACE = "\u00a70This block can be used to export and import items in and out of a Pressure Chamber. You select whether it's exporting or importing by how you place the block. The 'I' means it's Importing on that side, 'O' means it's Outputting. Use the filter slots to select which items are allowed to be imported/exported.";
    public static final String INFO_VACUUM_PUMP = "\u00a70This machine is used to achieve a vacuum. To do this this machine uses pressurized air. Apply pressurized air at the '+' tube, and when " + PneumaticValues.MIN_PRESSURE_VACUUM_PUMP + " bar is reached, air at the '-' tube will be sucked.";
    public static final String INFO_ASSEMBLY_CONTROLLER = "\u00a70This machine is used to control other assembly machines. It can control any connected assembly machine, and the machines connecting these assembly machines, and so on... To start the assembly put a program in the program slot.";
    public static final String INFO_LIGHT_BOX = "\u00a70With this machine you can expose Empty PCB's to UV light. If this happens in such a way that only a part of the PCB gets exposed, this part will hold it's copper traces when etched in an Etching tank. The longer you expose a PCB, the higher the chance that the PCB will be successfully etched.";
    public static final String INFO_SECURITY_STATION = EnumChatFormatting.BLACK + "When you want to protect an area from others messing around with your belongings, you can use this block to prevent others from interacting/breaking with every block within its range. You can whitelist players by adding them in the Access Stat. There's no in-game tutorial available just yet for how to set up the network.";
    public static final String INFO_HACKING = EnumChatFormatting.BLACK + "In here you can hack a Security Station. You start at the IO Port. From there, you can hack Network Nodes by left-clicking on them. Every time you do so, you have a chance to be detected by the Diagnostic Subroutine, which then will initiate a trace. You lose when the Subroutine has found your IO Port. You win when you've either hacked every Subroutine or every Registry.";
    public static final String INFO_UNIVERSAL_SENSOR = EnumChatFormatting.BLACK + "Like the name suggests, you can use this device as sensor in many applications. To select a sensor, put in the right Upgrades and navigate through the folder structure. Sensors are marked with a yellow button text.";
    public static final String INFO_PNEUMATIC_GENERATOR = EnumChatFormatting.BLACK + "This machine is only useful when having IndustrialCraft 2 installed. The machine's sole purpose is to convert compressed air into IC2's EU. You can interact with this machine with an IC2 Wrench just like any other IC2 machine.";
    public static final String INFO_ELECTRIC_COMPRESSOR = EnumChatFormatting.BLACK + "This machine is only useful when having IndustrialCraft 2 installed. The machine's sole purpose is to convert IC2's EU into compressed air. You can interact with this machine with an IC2 Wrench just like any other IC2 machine.";
    public static final String INFO_PNEUMATIC_ENGINE = EnumChatFormatting.BLACK + "This machine is only useful when having BuildCraft installed. The machine's sole purpose is to convert compressed air into BuildCraft's MJ. You can interact with this machine with a BuildCraft Wrench just like any other BuildCraft engine.";
    public static final String INFO_KINETIC_COMPRESSOR = EnumChatFormatting.BLACK + "This machine is only useful when having BuildCraft installed. The machine's sole purpose is to convert BuildCraft's MJ into compressed air. You can interact with this machine with a BuildCraft Wrench just like any other BuildCraft machine.";
    public static final String INFO_AERIAL_INTERFACE = EnumChatFormatting.BLACK + "By using an advanced technology which compresses items so much they become as small as atoms, this machine can use a player's inventory as its own. This means you can hopper items in and out of this machine, and they will be added or removed to the inventory of the player who placed the block. Smarter insertion methods like (the mod) Translocators could be used to keep the player's inventory supplied with 64 torches for example.";
    public static final String INFO_ELECTROSTATIC_COMPRESSOR = EnumChatFormatting.BLACK + "In the real world it has been stated it's incredibly difficult to do, in this world it's a reality: creating energy from lightning. When this machine gets hit by lightning, it produces " + PneumaticValues.PRODUCTION_ELECTROSTATIC_COMPRESSOR + " mL instantly. To increase the chance that the machine will be hit, you can make a grid of Iron Bars and attach it to this machine. The bolt will then travel through the bars into the machine.";
    public static final String INFO_PNEUMATIC_DOOR = EnumChatFormatting.BLACK + "This machine, when placed next to a Pneumatic Door, will automatically open the door when there are players nearby. When the Pneumatic Door Base is within range of a Security Station, the Pneumatic Door Base will only react to players which are allowed by the Security Station. Place any normal block in the camo slot to make the block look like that block.";
    public static final String INFO_OMNIDIRECTIONAL_HOPPER = EnumChatFormatting.BLACK + "Did you ever want to use Hoppers to extract items from an other side than the bottom of an inventory? Or did you wish that the Hopper was transfering items faster? Then this Omnidirectional Hopper is for you. Apart from that you can place it in any direction you want, it can also be upgraded like other PneumaticCraft machines.";
    public static final String INFO_PROGRAMMER = EnumChatFormatting.BLACK + "With this block you can program Drones. This is done with a simplified way of programming: A puzzle-like flowchart. Drones have only one hard programmed feature in them that overrules any other custom one: When the Drone gets low on air, it'll search for a nearby Charging Station with Dispenser upgrade inserted that has more than " + PneumaticCraftUtils.roundNumberTo(PneumaticValues.DRONE_LOW_PRESSURE, 1) + " bar. \n \nTips: \n-You can copy puzzle pieces by middle clicking them. \n-You can insert Machine Upgrades in the Drones. Put a Drone in a Charging Station to see what's possible and to insert them.";

    // upgrade texts.
    public static final List<String> UPGRADES_AIR_CANNON = new ArrayList<String>(Arrays.asList("\u00a77-Dispenser Upgrade", "\u00a70Will make the cannon act like a Dispenser. Any item that would act special in a Dispenser, will be handled the same way in here.", "\u00a77-Item Life Upgrade", "\u00a70By default the Air Cannon shoots items which have a lifespan of 60 seconds. For each of this upgrades you put in you get an additional 30 seconds.", UPGRADES_VOLUME_TEXT, "\u00a77-Speed Upgrade", "\u00a70The cannon will turn faster.", EnumChatFormatting.GRAY + "-Range Upgrade", EnumChatFormatting.BLACK + "The shooting range will increase by about 25 blocks per upgrade, up to 250 blocks.", UPGRADES_SECURITY_TEXT));
    public static final List<String> UPGRADES_PRESSURE_CHAMBER = new ArrayList<String>(Arrays.asList("\u00a77-Item Life Upgrade ", "\u00a70Items in the pressure chamber with this upgrade cannot despawn (their age is paused).", UPGRADES_VOLUME_TEXT, UPGRADES_SECURITY_TEXT));
    public static final List<String> UPGRADES_AIR_COMPRESSOR = new ArrayList<String>(Arrays.asList(UPGRADES_VOLUME_TEXT, "\u00a77-Speed Upgrade", "\u00a70The Air Compressor will produce more compressed air per tick. However this is at the expense of the efficiency.", UPGRADES_SECURITY_TEXT));
    public static final List<String> UPGRADES_CHARGING_STATION = new ArrayList<String>(Arrays.asList(UPGRADES_VOLUME_TEXT, "\u00a77-Speed Upgrade", "\u00a70The Charging Station will be able to (dis)charge items faster.", "\u00a77-Dispenser Upgrade", "\u00a70Adds a charge pad onto the Charging Station, allowing it to (dis)charge any Drones, items, and player inventory items that are on top of the Charging Station.", UPGRADES_SECURITY_TEXT));
    public static final List<String> UPGRADES_ELEVATOR = new ArrayList<String>(Arrays.asList(UPGRADES_VOLUME_TEXT, "\u00a77-Speed Upgrade", "\u00a70The elevator will ascend/descent faster (at a higher energy cost).", UPGRADES_SECURITY_TEXT));
    public static final List<String> UPGRADE_PNEUMATIC_HELMET_ENTITY_TEXT = new ArrayList<String>(Arrays.asList("\u00a77-Entity Tracker Upgrade", "\u00a70With this upgrade in, the helmet is able to track any living entity within a range of 16 blocks. These entities don't have to be visible, making this upgrade a perfect way to prevent Creepers sneaking up on you."));
    public static final List<String> UPGRADE_PNEUMATIC_HELMET_BLOCK_TEXT = new ArrayList<String>(Arrays.asList("\u00a77-Block Tracker Upgrade", "\u00a70With this upgrade you'll be able to track Chests, Mob Spawners, Furnaces, Silverfish Blocks, Tripwires, Dispensers, TNT and End Portal Blocks within a range of 30 blocks. This way Dungeons, Fortresses and temples can easily be found. Inventories even can be remotely explored, as hovering over one of these indicators will show their inventories."));
    public static final List<String> UPGRADE_PNEUMATIC_HELMET_SEARCHER = new ArrayList<String>(Arrays.asList("\u00a77-Item Search Upgrade", "\u00a70This upgrade allows you to search for a specific item in (for example) your base. This upgrade depends on the Block Tracker, to be able to find the item existing in inventories, and on the Entity Tracker, which allows it to find the searched item when it lies on the ground. To experience the full effect of the upgrade you should install both these upgrades."));
    public static final List<String> UPGRADE_PNEUMATIC_HELMET_COORD_TRACKER = new ArrayList<String>(Arrays.asList("\u00a77-Coordinate Tracker Upgrade", "\u00a70This upgrade allows you to track one specific coordinate, which can be used for example when you are tunneling to a certain location, without knowing the exact place this location is at in relation to where you are at that moment. Meant for people that don't like to use F3. As second feature this upgrade will use Minecraft's entity pathfinding to navigate you to wherever you want."));
    public static final List<String> UPGRADES_PRESSURE_CHAMBER_INTERFACE_TEXT = new ArrayList<String>(Arrays.asList("\u00a77-Speed Upgrade", "\u00a70The floodgates of the Interface will open/close faster, meaning items can be transported quicker."));
    public static final List<String> UPGRADES_VACUUM_PUMP = new ArrayList<String>(Arrays.asList(UPGRADES_VOLUME_TEXT, UPGRADES_SECURITY_TEXT, "\u00a77-Speed Upgrade", "\u00a70The Vacuum Pump will produce more vacuum per tick. However this is at the expense of the efficiency."));
    public static final List<String> UPGRADES_ASSEMBLY_CONTROLLER = new ArrayList<String>(Arrays.asList(UPGRADES_VOLUME_TEXT, UPGRADES_SECURITY_TEXT, "\u00a77-Speed Upgrade", "\u00a70All assembly machines that are controlled by this Controller will operate faster."));
    public static final List<String> UPGRADES_LIGHT_BOX = new ArrayList<String>(Arrays.asList(UPGRADES_VOLUME_TEXT, UPGRADES_SECURITY_TEXT, "\u00a77-Speed Upgrade", "\u00a70The UV lights will glow brighter and will expose PCB's quicker."));
    public static final List<String> UPGRADES_SECURITY_STATION = new ArrayList<String>(Arrays.asList(EnumChatFormatting.GRAY + "-Range Upgrade", EnumChatFormatting.BLACK + "Increases the (square) range of the Security Station by one for each upgrade (up to " + TileEntityConstants.SECURITY_STATION_MAX_RANGE + " blocks).", EnumChatFormatting.GRAY + "-Security Upgrade", EnumChatFormatting.BLACK + "Increases the Security Station's rating by one for each upgrade, which means that players need more Security Upgrades themselves to be able to hack this Station.", EnumChatFormatting.GRAY + "-Entity Tracker", EnumChatFormatting.BLACK + "Increases the Intrusion Detection Chance with 20%% per upgrade."));
    public static final List<String> UPGRADES_HACKING = new ArrayList<String>(Arrays.asList(EnumChatFormatting.GRAY + "Security Upgrade", EnumChatFormatting.BLACK + "Allows higher rated Security Stations to be hacked (one level for each upgrade)."));
    public static final List<String> UPGRADES_PNEUMATIC_GENERATOR = new ArrayList<String>(Arrays.asList(EnumChatFormatting.GRAY + "-Speed Upgrade", EnumChatFormatting.BLACK + "Adjusts the output rate:", EnumChatFormatting.BLACK + "0 upgrades --> 32 EU/t", EnumChatFormatting.BLACK + "1 upgrade --> 128 EU/t", EnumChatFormatting.BLACK + "2 upgrades --> 512 EU/t", UPGRADES_VOLUME_TEXT, UPGRADES_SECURITY_TEXT));
    public static final List<String> UPGRADES_ELECTRIC_COMPRESSOR = new ArrayList<String>(Arrays.asList(EnumChatFormatting.GRAY + "-(IC2) Transformer Upgrade", EnumChatFormatting.BLACK + "Allow a higher EU rate to be accepted.", EnumChatFormatting.BLACK + "0 upgrades --> 32 EU/t", EnumChatFormatting.BLACK + "1 upgrade --> 128 EU/t", EnumChatFormatting.BLACK + "2 upgrades --> 512 EU/t", UPGRADES_VOLUME_TEXT, UPGRADES_SECURITY_TEXT));
    public static final List<String> UPGRADES_PNEUMATIC_ENGINE = new ArrayList<String>(Arrays.asList(UPGRADES_VOLUME_TEXT, UPGRADES_SECURITY_TEXT));
    public static final List<String> UPGRADES_KINETIC_COMPRESSOR = new ArrayList<String>(Arrays.asList(UPGRADES_VOLUME_TEXT, UPGRADES_SECURITY_TEXT));
    public static final List<String> UPGRADES_AERIAL_INTERFACE = new ArrayList<String>(Arrays.asList(UPGRADES_VOLUME_TEXT, UPGRADES_SECURITY_TEXT));
    public static final List<String> UPGRADES_ELECTROSTATIC_COMPRESSOR = new ArrayList<String>(Arrays.asList(UPGRADES_VOLUME_TEXT, UPGRADES_SECURITY_TEXT));
    public static final List<String> UPGRADES_PNEUMATIC_DOOR = new ArrayList<String>(Arrays.asList(UPGRADES_VOLUME_TEXT, UPGRADES_SECURITY_TEXT, EnumChatFormatting.GRAY + "Range Upgrade", EnumChatFormatting.BLACK + "Increases the player detection range by one block for every upgrade.", EnumChatFormatting.GRAY + "Speed Upgrade", EnumChatFormatting.BLACK + "Increases the speed at which the door opens/closes."));
    public static final List<String> UPGRADES_OMNIDIRECTIONAL_HOPPER = new ArrayList<String>(Arrays.asList(EnumChatFormatting.GRAY + "Speed Upgrade", EnumChatFormatting.BLACK + "Increases the speed at which the Hopper transfers items."));

    //misc
    public static final List<String> NUKE_VIRUS_INFO = new ArrayList<String>(Arrays.asList(EnumChatFormatting.BLACK + "The Nuke Virus is a consumable item which can be used to insta-capture (without time loss) a Network Node without any chance of being detected by the Diagnostic Subroutine. This also works with every other Network component. To use it, middle-click a hackable node."));
    public static final List<String> STOP_WORM_INFO = new ArrayList<String>(Arrays.asList(EnumChatFormatting.BLACK + "With a STOP! Worm you can stop a Diagnostic Subroutine from tracing you for 5 seconds. This software will be used in the process. To use it click on the STOP! Worm icon on the right when you are detected (else it would serve no purpose)."));

}