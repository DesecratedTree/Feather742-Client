package deob;

import java.io.IOException;

public class IncomingPacket {

	public static IncomingPacket SWITCH_WINDOW_PANE = new IncomingPacket(0, 8);

	public static IncomingPacket CLAN_SETTINGS_PACKET = new IncomingPacket(1, -2);

	public static IncomingPacket GAME_MESSAGE_PACKET = new IncomingPacket(2, -1);

	public static IncomingPacket aClass222_2190 = new IncomingPacket(3, 10);

	public static IncomingPacket SKILL_STAT_PACKET = new IncomingPacket(4, 6);

	public static IncomingPacket aClass222_2241 = new IncomingPacket(5, 10);

	public static IncomingPacket WORLD_TILE_PACKET = new IncomingPacket(6, 3);

	public static IncomingPacket aClass222_2194 = new IncomingPacket(7, 32);

	public static IncomingPacket SET_MOUSE_PACKET = new IncomingPacket(8, -1);

	public static IncomingPacket aClass222_2230 = new IncomingPacket(9, 0);

	public static IncomingPacket VARP1_PACKET = new IncomingPacket(10, 3);

	public static IncomingPacket aClass222_2198 = new IncomingPacket(11, 2);

	public static IncomingPacket ALIVE_PACKET = new IncomingPacket(12, 0);

	public static IncomingPacket aClass222_2255 = new IncomingPacket(13, 8);

	public static IncomingPacket ICOMPONENT_MODEL_PACKET = new IncomingPacket(14, 8);

	public static IncomingPacket SOUND_INDEX14_PACKET = new IncomingPacket(15, 8);

	public static IncomingPacket aClass222_2203 = new IncomingPacket(16, 8);

	public static IncomingPacket ANIMATE_INTERFACE_PACKET = new IncomingPacket(17, 8);

	public static IncomingPacket UNLOCK_IGNORES_LIST_PACKET = new IncomingPacket(18, 0);

	public static IncomingPacket aClass222_2206 = new IncomingPacket(19, 0);

	public static IncomingPacket aClass222_2207 = new IncomingPacket(20, 10);

	public static IncomingPacket LOGOUT_PACKET = new IncomingPacket(21, 0);

	public static IncomingPacket GLOBAL_CONFIG1_PACKET = new IncomingPacket(22, 3);

	public static IncomingPacket FRIENDS_CHAT_PACKET = new IncomingPacket(23, -2);

	public static IncomingPacket aClass222_2211 = new IncomingPacket(24, -2);

	public static IncomingPacket CAMERA_POSITION_PACKET = new IncomingPacket(25, 6);

	public static IncomingPacket SOUND_INDEX15_PACKET = new IncomingPacket(26, 6);

	public static IncomingPacket aClass222_2247 = new IncomingPacket(27, 0);

	public static IncomingPacket RESET_CAMERA_PACKET = new IncomingPacket(28, 0);

	public static IncomingPacket RUNSCRIPT_PACKET = new IncomingPacket(29, -2);

	public static IncomingPacket GROUND_ITEM_PACKET = new IncomingPacket(30, 5);

	public static IncomingPacket aClass222_2325 = new IncomingPacket(31, -1);

	public static IncomingPacket aClass222_2219 = new IncomingPacket(32, 1);

	public static IncomingPacket aClass222_2236 = new IncomingPacket(33, 3);

	public static IncomingPacket aClass222_2188 = new IncomingPacket(34, 0);

	public static IncomingPacket LOBBY_LOGOUT_PACKET = new IncomingPacket(35, 0);

	public static IncomingPacket aClass222_2223 = new IncomingPacket(36, -1);

	public static IncomingPacket DESTROY_OBJECT_PACKET = new IncomingPacket(37, 2);

	public static IncomingPacket aClass222_2343 = new IncomingPacket(38, 4);

	public static IncomingPacket MUSIC_PACKET = new IncomingPacket(39, 4);

	public static IncomingPacket aClass222_2227 = new IncomingPacket(40, 1);

	public static IncomingPacket aClass222_2228 = new IncomingPacket(41, 7);

	public static IncomingPacket ITEM_ON_INTERFACE_PACKET = new IncomingPacket(42, 10);

	public static IncomingPacket SPAWN_OBJECT_PACKET = new IncomingPacket(43, 6);

	public static IncomingPacket aClass222_2208 = new IncomingPacket(44, -1);

	public static IncomingPacket WINDOW_PANE_PACKET = new IncomingPacket(45, 19);

	public static IncomingPacket aClass222_2233 = new IncomingPacket(46, -1);

	public static IncomingPacket GAME_INTERFACE_PACKET = new IncomingPacket(47, 23);

	public static IncomingPacket aClass222_2235 = new IncomingPacket(48, 0);

	public static IncomingPacket PLAYER_ON_INTERFACE_PACKET = new IncomingPacket(49, 4);

	public static IncomingPacket GLOBAL_STRING1_PACKET = new IncomingPacket(50, -1);

	public static IncomingPacket aClass222_2238 = new IncomingPacket(51, 5);

	public static IncomingPacket aClass222_2239 = new IncomingPacket(52, 2);

	public static IncomingPacket aClass222_2221 = new IncomingPacket(53, 6);

	public static IncomingPacket aClass222_2197 = new IncomingPacket(54, 2);

	public static IncomingPacket GLOBAL_STRING2_PACKET = new IncomingPacket(55, -2);

	public static IncomingPacket CAMERA_ROTATION_PACKET = new IncomingPacket(56, 4);

	public static IncomingPacket PUBLIC_CHAT_PACKET = new IncomingPacket(57, -1);

	public static IncomingPacket ITEM_WEIGHT_PACKET = new IncomingPacket(58, -1);

	public static IncomingPacket aClass222_2225 = new IncomingPacket(59, -2);

	public static IncomingPacket RECEIVE_CLAN_QUICKCHAT_MESSAGE_PACKET = new IncomingPacket(60, -1);

	public static IncomingPacket SEND_URL_PACKET = new IncomingPacket(61, -2);

	public static IncomingPacket aClass222_2249 = new IncomingPacket(62, 3);

	public static IncomingPacket aClass222_2229 = new IncomingPacket(63, 4);

	public static IncomingPacket aClass222_2210 = new IncomingPacket(64, 25);

	public static IncomingPacket LARGE_NPC_UPDATE_PACKET = new IncomingPacket(65, -2);

	public static IncomingPacket aClass222_2253 = new IncomingPacket(66, 6);

	public static IncomingPacket SEND_ITEMS_PACKET = new IncomingPacket(67, -2);

	public static IncomingPacket GRAND_EXCHANGE_OFFER_PACKET = new IncomingPacket(68, 20);

	public static IncomingPacket RUN_ENERGY_PACKET = new IncomingPacket(69, 1);

	public static IncomingPacket aClass222_2317 = new IncomingPacket(70, 3);

	public static IncomingPacket REMOVE_GROUND_ITEM_PACKET = new IncomingPacket(71, 3);

	public static IncomingPacket NPC_UPDATE_PACKET = new IncomingPacket(72, -2);

	public static IncomingPacket PLAYERS_OVER_NPCS_PACKET = new IncomingPacket(73, 1);

	public static IncomingPacket HINT_ICON_PACKET = new IncomingPacket(74, 14);

	public static IncomingPacket GAME_BAR_STAGES_PACKET = new IncomingPacket(75, 2);

	public static IncomingPacket PRIVATE_GAME_BAR_STAGE_PACKET = new IncomingPacket(76, 1);

	public static IncomingPacket aClass222_2264 = new IncomingPacket(77, 19);

	public static IncomingPacket aClass222_2240 = new IncomingPacket(78, 8);

	public static IncomingPacket aClass222_2266 = new IncomingPacket(79, 5);

	public static IncomingPacket aClass222_2267 = new IncomingPacket(80, -1);

	public static IncomingPacket aClass222_2268 = new IncomingPacket(81, 4);

	public static IncomingPacket VARP2_PACKET = new IncomingPacket(82, 6);

	public static IncomingPacket aClass222_2212 = new IncomingPacket(83, 5);

	public static IncomingPacket aClass222_2271 = new IncomingPacket(84, 9);

	public static IncomingPacket GRAPHICS_PACKET = new IncomingPacket(85, 12);

	public static IncomingPacket SEND_FRIENDS_CHAT_MESSAGE_PACKET = new IncomingPacket(86, -1);

	public static IncomingPacket RECEIVE_FRIENDS_CHAT_MESSAGE_PACKET = new IncomingPacket(87, 0);

	public static IncomingPacket aClass222_2275 = new IncomingPacket(88, 28);

	public static IncomingPacket MAP_REGION_PACKET = new IncomingPacket(89, -2);

	public static IncomingPacket PLAYERS_UPDATE_PACKET = new IncomingPacket(90, -2);

	public static IncomingPacket CAMERA_SHAKE_PACKET = new IncomingPacket(91, 6);

	public static IncomingPacket aClass222_2279 = new IncomingPacket(92, 2);

	public static IncomingPacket aClass222_2280 = new IncomingPacket(93, -2);

	public static IncomingPacket UPDATE_ITEMS_PACKET = new IncomingPacket(94, -2);

	public static IncomingPacket aClass222_2282 = new IncomingPacket(95, 6);

	public static IncomingPacket aClass222_2283 = new IncomingPacket(96, 6);

	public static IncomingPacket INTERFACE_SPRIT_PACKET = new IncomingPacket(97, 8);

	public static IncomingPacket IGNORES_PACKET = new IncomingPacket(98, -2);

	public static IncomingPacket CONFIG_BY_FILE2_PACKET = new IncomingPacket(99, 6);

	public static IncomingPacket aClass222_2287 = new IncomingPacket(100, 8);

	public static IncomingPacket MINIMAP_FLAG_PACKET = new IncomingPacket(101, 2);

	public static IncomingPacket aClass222_2289 = new IncomingPacket(102, 4);

	public static IncomingPacket aClass222_2204 = new IncomingPacket(103, 9);

	public static IncomingPacket aClass222_2291 = new IncomingPacket(104, 2);

	public static IncomingPacket aClass222_2196 = new IncomingPacket(105, 10);

	public static IncomingPacket aClass222_2250 = new IncomingPacket(106, -2);

	public static IncomingPacket ICOMPONENT_TEXT_PACKET = new IncomingPacket(107, -2);

	public static IncomingPacket aClass222_2295 = new IncomingPacket(108, 6);

	public static IncomingPacket CAMERA_LOOK_PACKET = new IncomingPacket(109, 6);

	public static IncomingPacket aClass222_2297 = new IncomingPacket(110, 29);

	public static IncomingPacket aClass222_2298 = new IncomingPacket(111, 1);

	public static IncomingPacket aClass222_2257 = new IncomingPacket(112, 5);

	public static IncomingPacket INTERFACE_CONFIG_PACKET = new IncomingPacket(113, 5);

	public static IncomingPacket WORLD_LIST_PACKET = new IncomingPacket(114, -2);

	public static IncomingPacket aClass222_2302 = new IncomingPacket(115, 10);

	public static IncomingPacket aClass222_2303 = new IncomingPacket(116, -1);

	public static IncomingPacket aClass222_2246 = new IncomingPacket(117, 11);

	public static IncomingPacket ACCESS_MASK_PACKET = new IncomingPacket(118, 12);

	public static IncomingPacket SOUND_EFFECT_PACKET = new IncomingPacket(119, 6);

	public static IncomingPacket RECEIVE_CLAN_CHAT_MESSAGE = new IncomingPacket(120, -1);

	public static IncomingPacket aClass222_2244 = new IncomingPacket(121, -1);

	public static IncomingPacket aClass222_2309 = new IncomingPacket(122, 2);

	public static IncomingPacket JOIN_CLAN_CHANNEL_PACKET = new IncomingPacket(123, -2);

	public static IncomingPacket aClass222_2311 = new IncomingPacket(124, 1);

	public static IncomingPacket aClass222_2312 = new IncomingPacket(125, 7);

	public static IncomingPacket aClass222_2313 = new IncomingPacket(126, 10);

	public static IncomingPacket PROJECTILE_PACKET = new IncomingPacket(127, 18);

	public static IncomingPacket aClass222_2315 = new IncomingPacket(128, 3);

	public static IncomingPacket OBJECT_ANIMATION_PACKET = new IncomingPacket(129, 9);

	public static IncomingPacket aClass222_2254 = new IncomingPacket(130, -2);

	public static IncomingPacket aClass222_2318 = new IncomingPacket(131, -1);

	public static IncomingPacket aClass222_2319 = new IncomingPacket(132, -1);

	public static IncomingPacket aClass222_2320 = new IncomingPacket(133, 10);

	public static IncomingPacket NPC_ON_INTERFACE_PACKET = new IncomingPacket(134, 8);

	public static IncomingPacket aClass222_2200 = new IncomingPacket(135, 0);

	public static IncomingPacket RECEIVE_PRIVATE_MESSAGE_PACKET = new IncomingPacket(136, -2);

	public static IncomingPacket SEND_PRIVATE_MESSAGE_PACKET = new IncomingPacket(137, -2);

	public static IncomingPacket aClass222_2192 = new IncomingPacket(138, 0);

	public static IncomingPacket aClass222_2326 = new IncomingPacket(139, -1);

	public static IncomingPacket FRIENDS_PACKET = new IncomingPacket(140, -2);

	public static IncomingPacket aClass222_2306 = new IncomingPacket(141, 21);

	public static IncomingPacket aClass222_2245 = new IncomingPacket(142, 4);

	public static IncomingPacket CUTSCENE_PACKET = new IncomingPacket(143, -2);

	public static IncomingPacket aClass222_2214 = new IncomingPacket(144, -1);

	public static IncomingPacket aClass222_2332 = new IncomingPacket(145, 2);

	public static IncomingPacket aClass222_2333 = new IncomingPacket(146, -1);

	public static IncomingPacket SYSTEM_UPDATE_PACKET = new IncomingPacket(147, 2);

	public static IncomingPacket CLOSE_INTERFACE_PACKET = new IncomingPacket(148, 4);

	public static IncomingPacket aClass222_2336 = new IncomingPacket(149, -2);

	public static IncomingPacket aClass222_2337 = new IncomingPacket(150, 8);

	public static IncomingPacket PLAYER_OPTION_PACKET = new IncomingPacket(151, -1);

	public static IncomingPacket GLOBAL_CONFIG2_PACKET = new IncomingPacket(152, 6);

	public static IncomingPacket DYNAMIC_MAP_REGION_PACKET = new IncomingPacket(153, -2);

	public static IncomingPacket aClass222_2341 = new IncomingPacket(154, 1);

	public static IncomingPacket aClass222_2342 = new IncomingPacket(155, 22);

	public static IncomingPacket CONFIG_BY_FILE1_PACKET = new IncomingPacket(156, 3);

	public static IncomingPacket aClass222_2344 = new IncomingPacket(157, 6);

	public static IncomingPacket aClass222_2345 = new IncomingPacket(158, 1);

	public static IncomingPacket MINIMAP_STATUS_PACKET = new IncomingPacket(159, 1);

	public static IncomingPacket aClass222_2237 = new IncomingPacket(160, 25);

	public static IncomingPacket aClass222_2348 = new IncomingPacket(161, -2);

	public static IncomingPacket aClass222_2349 = new IncomingPacket(162, -2);

	public static IncomingPacket SWITCH_ITEMS_LOOK_PACKET = new IncomingPacket(163, 1);

	public static IncomingPacket VOICES_NAME_PACKET = new IncomingPacket(164, -2);

	public static IncomingPacket ONE_TWENTY_SKILLS_PACKET = new IncomingPacket(165, 1);

	public static IncomingPacket VERSION_PACKET = new IncomingPacket(166, 1);

	public static IncomingPacket NO_VOICES_PACKET = new IncomingPacket(167, 1);

	public static IncomingPacket CHANGE_PRICES_PACKET = new IncomingPacket(168, -2);

	public int opcode;

	public int size;

	public int anInt2350;

	public int anInt2351;

	public IncomingPacket(int arg0, int arg1) {
		this.opcode = arg0;
		this.size = arg1;
		this.anInt2350 = arg0;
		this.anInt2351 = arg1;
	}

	public static final boolean decodeIncomingPacket(Class1 arg0, byte arg1) throws IOException {
		try {
			Class357 var2 = arg0.method380(-1619413432);
			Class330_Sub46_Sub2 var3 = arg0.aClass330_Sub46_Sub2_17;
			if (var2 == null) {
				return false;
			}
			int var5;
			if (arg0.currentIncomingPacket == null) {
				if (arg0.aBoolean27) {
					if (!var2.method4194(1, -1020237123)) {
						return false;
					}
					var2.method4195(arg0.aClass330_Sub46_Sub2_17.payload, 0, 1, -206977139);
					arg0.anInt31++;
					arg0.anInt30 = 0;
					arg0.aBoolean27 = false;
				}
				var3.offset = 0;
				if (var3.method3825((byte) 112)) {
					if (!var2.method4194(1, -1020237123)) {
						return false;
					}
					var2.method4195(arg0.aClass330_Sub46_Sub2_17.payload, 1, 1, -1966108589);
					arg0.anInt31++;
					arg0.anInt30 = 0;
				}
				arg0.aBoolean27 = true;
				IncomingPacket[] var4 = Class386.method4431(1154287061);
				var5 = var3.method3826(-401075417);
				if (var5 < 0 || var5 >= var4.length) {
					throw new IOException(var5 + " " + var3.offset);
				}
				arg0.currentIncomingPacket = var4[var5];
				arg0.anInt26 = arg0.currentIncomingPacket.anInt2351;
			}
			if (arg0.anInt26 == -1) {
				if (!var2.method4194(1, -1020237123)) {
					return false;
				}
				var2.method4195(var3.payload, 0, 1, 2052196055);
				arg0.anInt26 = var3.payload[0] & 0xFF;
				arg0.anInt31++;
				arg0.anInt30 = 0;
			}
			if (arg0.anInt26 == -2) {
				if (!var2.method4194(2, -1020237123)) {
					return false;
				}
				var2.method4195(var3.payload, 0, 2, 32882663);
				var3.offset = 0;
				arg0.anInt26 = var3.readUnsignedShort(-18636115);
				arg0.anInt31 += 2;
				arg0.anInt30 = 0;
			}
			if (arg0.anInt26 > 0) {
				if (!var2.method4194(arg0.anInt26, -1020237123)) {
					return false;
				}
				var3.offset = 0;
				var2.method4195(var3.payload, 0, arg0.anInt26, 1601804178);
				arg0.anInt31 += arg0.anInt26;
				arg0.anInt30 = 0;
			}
			arg0.aClass222_36 = arg0.aClass222_35;
			arg0.aClass222_35 = arg0.aClass222_20;
			arg0.aClass222_20 = arg0.currentIncomingPacket;
			boolean var26;
			if (arg0.aClass222_20.opcode == 12 || arg0.aClass222_20.opcode == 90 || arg0.aClass222_20.opcode == 72 || arg0.aClass222_20.opcode == 118 || SWITCH_ITEMS_LOOK_PACKET != arg0.currentIncomingPacket) {
				byte[] var30;
				boolean var38;
				String var40;
				Buffer var85;
				if (VOICES_NAME_PACKET == arg0.currentIncomingPacket) {
					var30 = new byte[arg0.anInt26 - 1];
					var38 = var3.readUnsignedByte(1843525994) == 1;
					var3.method3828(var30, 0, arg0.anInt26 - 1, 1689124730);
					var85 = new Buffer(var30);
					var40 = var85.readString(-1048963236);
					return true;
				} else if (ONE_TWENTY_SKILLS_PACKET == arg0.currentIncomingPacket) {
					var26 = var3.readUnsignedByte(39) == 1;
					if (var26) {
						Class429.anIntArray4366 = new int[] { 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120 };
					}
					arg0.currentIncomingPacket = null;
					return true;
				} else if (NO_VOICES_PACKET == arg0.currentIncomingPacket) {
					var26 = var3.readByte((byte) 39) == 1;
					arg0.currentIncomingPacket = null;
					return true;
				} else {
					int var27;
					int var31;
					int var33;
					if (CHANGE_PRICES_PACKET == arg0.currentIncomingPacket) {
						var27 = var3.readUnsignedShort(1114858842);
						for (var5 = 0; var5 < var27; var5++) {
							var33 = var3.readInt1((byte) 2);
							var31 = var3.readUnsignedShortA((byte) -115) - 1;
							if (var33 != -1 && var31 > 0) {
								ItemDefinitions.changePrice(var31, var33);
							}
						}
						arg0.currentIncomingPacket = null;
						return true;
					} else if (VERSION_PACKET == arg0.currentIncomingPacket) {
						var27 = var3.readUnsignedByte(822279483);
						if (var27 > 5) {
							SpecialKeys.sendJPanelMessage("You're using an old client. It is recommened that you update your client.");
						}
						arg0.currentIncomingPacket = null;
						return true;
					} else if (WORLD_LIST_PACKET == arg0.currentIncomingPacket) {
						var26 = var3.readUnsignedByte(-1455800) == 1;
						byte[] var131 = new byte[arg0.anInt26 - 1];
						var3.readBytes(var131, 0, arg0.anInt26 - 1, 1274334002);
						Class123.method1510(var26, var131, (short) 255);
						arg0.currentIncomingPacket = null;
						return true;
					} else if (arg0.currentIncomingPacket == LARGE_NPC_UPDATE_PACKET) {
						Class230.method2343(true, -387887132);
						arg0.currentIncomingPacket = null;
						return true;
					} else if (arg0.currentIncomingPacket == HINT_ICON_PACKET) {
						var27 = var3.readUnsignedByte(1245914405);
						var5 = var27 >> 5;
						var33 = var27 & 0x1F;
						if (var33 == 0) {
							client.aClass3Array8986[var5] = null;
							arg0.currentIncomingPacket = null;
							return true;
						}
						Class3 var121 = new Class3();
						var121.anInt53 = var33;
						var121.anInt46 = var3.readUnsignedByte(1589744399);
						if (var121.anInt46 >= 0 && var121.anInt46 < Class125.aClass61Array1457.length) {
							if (var121.anInt53 == 1 || var121.anInt53 == 10) {
								var121.anInt47 = var3.readUnsignedShort(2125666124);
								var121.anInt54 = var3.readUnsignedShort(1959794116);
								var3.offset += 4;
							} else if (var121.anInt53 >= 2 && var121.anInt53 <= 6) {
								if (var121.anInt53 == 2) {
									var121.anInt51 = 256;
									var121.anInt50 = 256;
								}
								if (var121.anInt53 == 3) {
									var121.anInt51 = 0;
									var121.anInt50 = 256;
								}
								if (var121.anInt53 == 4) {
									var121.anInt51 = 512;
									var121.anInt50 = 256;
								}
								if (var121.anInt53 == 5) {
									var121.anInt51 = 256;
									var121.anInt50 = 0;
								}
								if (var121.anInt53 == 6) {
									var121.anInt51 = 256;
									var121.anInt50 = 512;
								}
								var121.anInt53 = 2;
								var121.anInt48 = var3.readUnsignedByte(-280536378);
								Class381 var114 = client.aClass304_9030.method3022(-369295592);
								var121.anInt51 += var3.readUnsignedShort(1806442945) - var114.gameSceneBaseX << 9;
								var121.anInt50 += var3.readUnsignedShort(1127723106) - var114.gameSceneBaseY << 9;
								var121.anInt55 = var3.readUnsignedByte(995192358) << 2;
								var121.anInt49 = var3.readUnsignedShort(1202069461);
							}
							var121.anInt52 = var3.readInt((byte) 90);
							client.aClass3Array8986[var5] = var121;
						}
						arg0.currentIncomingPacket = null;
						return true;
					} else if (arg0.currentIncomingPacket == aClass222_2341) {
						var26 = var3.readUnsignedByte(1939490223) == 1;
						Class263_Sub3.method2630((byte) -43);
						Class211.aBoolean2061 = var26;
						arg0.currentIncomingPacket = null;
						return true;
					} else if (aClass222_2291 == arg0.currentIncomingPacket) {
						var27 = var3.readUnsignedLEShort(15163594);
						Class263_Sub3.method2630((byte) -114);
						Class95_Sub12_Sub1.method1140(var27, -1811134307);
						arg0.currentIncomingPacket = null;
						return true;
					} else if (aClass222_2190 == arg0.currentIncomingPacket) {
						var27 = var3.readUnsignedLEShort(15163594);
						var5 = var3.readUnsignedShort(395354870);
						var33 = var3.readInt1((byte) 2);
						var31 = var3.readUnsignedShort(1245397710);
						Class263_Sub3.method2630((byte) -95);
						Class228.method2316(var33, var31, var27, var5, -563985587);
						arg0.currentIncomingPacket = null;
						return true;
					} else if (aClass222_2343 == arg0.currentIncomingPacket) {
						var27 = var3.readInt((byte) 54);
						Class101.aClass148_6458 = new Class148(var27);
						Thread var130 = new Thread(Class101.aClass148_6458);
						var130.setPriority(1);
						var130.start();
						arg0.currentIncomingPacket = null;
						return true;
					} else if (GRAND_EXCHANGE_OFFER_PACKET == arg0.currentIncomingPacket) {
						var27 = var3.readUnsignedByte(576860694);
						if (var3.readUnsignedByte(-76743863) == 0) {
							client.aClass286Array9234[var27] = new Class286();
						} else {
							var3.offset--;
							client.aClass286Array9234[var27] = new Class286(var3);
						}
						client.anInt9202 = client.anInt9268;
						arg0.currentIncomingPacket = null;
						return true;
					} else {
						int var10;
						int var11;
						int var12;
						int var35;
						int var37;
						Class381 var66;
						if (arg0.currentIncomingPacket == OBJECT_ANIMATION_PACKET) {
							var27 = var3.readUnsignedByteC(-243015761);
							var5 = var27 >> 2;
							var33 = var27 & 0x3;
							var31 = client.anIntArray9036[var5];
							var35 = var3.readInt((byte) 85);
							var37 = var35 >> 28 & 0x3;
							var10 = var35 >> 14 & 0x3FFF;
							var11 = var35 & 0x3FFF;
							var12 = var3.readInt1((byte) 2);
							var66 = client.aClass304_9030.method3022(-646364676);
							var10 -= var66.gameSceneBaseX;
							var11 -= var66.gameSceneBaseY;
							Class147.method1744(var37, var10, var11, var31, var5, var33, var12, -1964924778);
							arg0.currentIncomingPacket = null;
							return true;
						} else if (CONFIG_BY_FILE2_PACKET == arg0.currentIncomingPacket) {
							var27 = var3.readUnsignedShortA((byte) -92);
							var5 = var3.readInt((byte) 4);
							Class158.aClass561_6474.sendConfigByFile(var27, var5, 16711935);
							arg0.currentIncomingPacket = null;
							return true;
						} else {
							String var6;
							long var7;
							long var9;
							String var28;
							boolean var67;
							int var70;
							long var80;
							if (arg0.currentIncomingPacket == RECEIVE_PRIVATE_MESSAGE_PACKET) {
								var26 = var3.readUnsignedByte(34558536) == 1;
								var28 = var3.readString(-819401514);
								var6 = var28;
								if (var26) {
									var6 = var3.readString(246383565);
								}
								var7 = var3.readUnsignedShort(2086959762);
								var9 = var3.readUnsignedTriByte(-1401356047);
								var11 = var3.readUnsignedByte(489271900);
								var80 = var9 + (var7 << 32);
								var67 = false;
								var70 = 0;
								while (true) {
									if (var70 >= 100) {
										if (var11 <= 1) {
											if (client.aBoolean9083 && !client.aBoolean9228 || client.aBoolean9073) {
												var67 = true;
											} else if (Class65.foundPlayer(var6, -470807013)) {
												var67 = true;
											}
										}
										break;
									}
									if (client.aLongArray9064[var70] == var80) {
										var67 = true;
										break;
									}
									var70++;
								}
								if (!var67) {
									client.aLongArray9064[client.anInt9190] = var80;
									client.anInt9190 = (client.anInt9190 + 1) % 100;
									String var97 = Class117.method1426(Class113.method1386(var3, 1909155501), 1201716859);
									if (var11 == 2) {
										Class81.sendSpeech(7, 0, Class325_Sub4.method3225(1, -2003475637) + var28, Class325_Sub4.method3225(1, -1977796126) + var6, var28, var97, null, -1, (byte) 35);
									} else if (var11 == 1) {
										Class81.sendSpeech(7, 0, Class325_Sub4.method3225(0, -1032321354) + var28, Class325_Sub4.method3225(0, 720224291) + var6, var28, var97, null, -1, (byte) 33);
									} else if (var11 == 0) {
										Class81.sendSpeech(3, 0, var28, var6, var28, var97, null, -1, (byte) 114);
									} else {
										Class81.sendSpeech(3, 0, "<img=" + var11 + ">" + var28, "<img=" + var11 + ">" + var6, var28, var97, null, -1, (byte) 114);
									}
								}
								arg0.currentIncomingPacket = null;
								return true;
							} else if (arg0.currentIncomingPacket == LOBBY_LOGOUT_PACKET) {
								Class330_Sub31.logout(Class360.lobby, 1317892923);
								arg0.currentIncomingPacket = null;
								return false;
							} else if (SWITCH_WINDOW_PANE == arg0.currentIncomingPacket) {
								var27 = var3.readLEInt(-4409072);
								var5 = var3.readInt2(-793658723);
								Class263_Sub3.method2630((byte) -33);
								Class330_Sub48 var128 = (Class330_Sub48) client.aClass497_9284.method6094((long) var27);
								Class330_Sub48 var119 = (Class330_Sub48) client.aClass497_9284.method6094((long) var5);
								if (var119 != null) {
									Class75.method854(var119, var128 == null || var128.anInt7859 != var119.anInt7859, false, -1649084571);
								}
								if (var128 != null) {
									var128.method3252(914366986);
									client.aClass497_9284.method6097(var128, (long) var5);
								}
								IComponentDefinitions var113 = Class95.method1101(var27, -1756043255);
								if (var113 != null) {
									Class404.method4738(var113, 2059125602);
								}
								var113 = Class95.method1101(var5, 792113780);
								if (var113 != null) {
									Class404.method4738(var113, 1810414351);
									Class156.method1829(Class3.aClass120Array56[var113.anInt1196 >>> 16], var113, true, 392149236);
								}
								if (client.windowPaneId != -1) {
									Class527.method6268(client.windowPaneId, 1, (byte) 54);
								}
								arg0.currentIncomingPacket = null;
								return true;
							} else if (arg0.currentIncomingPacket == aClass222_2337) {
								var27 = var3.readInt((byte) 21);
								var5 = var3.readInt((byte) 99);
								Class330_Sub34 var127 = Class238.method2377(OutgoingPacket.aClass234_2559, arg0.aClass488_22, 1787093595);
								var127.aClass330_Sub46_Sub2_7729.addInt2(var27, (byte) 1);
								var127.aClass330_Sub46_Sub2_7729.addInt2(var5, (byte) 1);
								var127.aClass330_Sub46_Sub2_7729.addByteS(client.anInt6603, 698603049);
								arg0.method378(var127, -1277754960);
								arg0.currentIncomingPacket = null;
								return true;
							} else if (aClass222_2311 == arg0.currentIncomingPacket) {
								var27 = var3.readUnsignedByte(1295400337);
								Class468 var129 = (Class468) Class479.method6015(Class430.method5336(1109274241), var27, (byte) 69);
								if (var129 == null) {
									var129 = Class468.aClass468_6856;
								}
								Class103.method1239(var129, (byte) -5);
								arg0.currentIncomingPacket = null;
								return true;
							} else if (arg0.currentIncomingPacket == aClass222_2237) {
								var27 = var3.readInt1((byte) 2);
								var5 = var3.readUnsignedLEShortA(1433401916);
								var33 = var3.readInt((byte) 118);
								var31 = var3.readInt((byte) 58);
								var35 = var3.readUnsignedLEShortA(139057160);
								var37 = var3.readLEInt(-88067930);
								var10 = var3.readLEInt(570804311);
								var11 = var3.readUnsignedByte(734349342);
								Class263_Sub3.method2630((byte) -96);
								Class423.method5302(var27, new Class330_Sub48_Sub4(var35, var11, var5), new int[] { var10, var37, var33, var31 }, false, (short) 16385);
								arg0.currentIncomingPacket = null;
								return true;
							} else if (arg0.currentIncomingPacket == aClass222_2253) {
								var27 = var3.readUnsignedLEShort(15163594);
								var5 = var3.readInt((byte) 31);
								Class263_Sub3.method2630((byte) -42);
								Class512.method6191(var5, var27, (byte) -17);
								arg0.currentIncomingPacket = null;
								return true;
							} else if (aClass222_2188 == arg0.currentIncomingPacket) {
								Class43.method591(-475877905);
								arg0.currentIncomingPacket = null;
								return false;
							} else if (arg0.currentIncomingPacket == aClass222_2206) {
								Class158.aClass561_6474.method6463((short) -8466);
								client.anInt9186 += 32;
								arg0.currentIncomingPacket = null;
								return true;
							} else {
								boolean var15;
								boolean var39;
								int var53;
								String var57;
								if (FRIENDS_PACKET == arg0.currentIncomingPacket) {
									while (var3.offset < arg0.anInt26) {
										var26 = var3.readUnsignedByte(2102327633) == 1;
										var28 = var3.readString(-905856779);
										var6 = var3.readString(1991129033);
										var31 = var3.readUnsignedShort(344113898);
										var35 = var3.readUnsignedByte(-241542926);
										var39 = var3.readUnsignedByte(763393499) == 1;
										var57 = "";
										var11 = -1;
										var12 = 0;
										if (var31 > 0) {
											var57 = var3.readString(731507504);
											var11 = var3.readUnsignedByte(1580020473);
											var12 = var3.readInt((byte) 23);
										}
										for (var53 = 0; var53 < client.anInt9256; var53++) {
											Class99 var86 = client.aClass99Array9259[var53];
											if (var26) {
												if (var6.equals(var86.aString915)) {
													var86.aString915 = var28;
													var86.aString910 = var6;
													var28 = null;
													break;
												}
											} else if (var28.equals(var86.aString915)) {
												if (var86.anInt911 != var31) {
													var15 = true;
													for (Class325_Sub5 var112 = (Class325_Sub5) client.aClass467_9260.method5854(-857586788); var112 != null; var112 = (Class325_Sub5) client.aClass467_9260.method5857(-1547254846)) {
														if (var112.aString7488.equals(var28)) {
															if (var31 != 0 && var112.aShort7489 == 0) {
																var112.method3204(590285252);
																var15 = false;
															} else if (var31 == 0 && var112.aShort7489 != 0) {
																var112.method3204(1411096364);
																var15 = false;
															}
														}
													}
													if (var15) {
														client.aClass467_9260.method5852(new Class325_Sub5(var28, var31), (byte) 1);
													}
													var86.anInt911 = var31;
												}
												var86.aString910 = var6;
												var86.aString912 = var57;
												var86.anInt913 = var35;
												var86.anInt914 = var11;
												var86.aBoolean909 = var39;
												var86.anInt916 = var12;
												var28 = null;
												break;
											}
										}
										if (var28 != null && client.anInt9256 < 200) {
											Class99 var98 = new Class99();
											client.aClass99Array9259[client.anInt9256] = var98;
											var98.aString915 = var28;
											var98.aString910 = var6;
											var98.anInt911 = var31;
											var98.aString912 = var57;
											var98.anInt913 = var35;
											var98.anInt914 = var11;
											var98.aBoolean909 = var39;
											var98.anInt916 = var12;
											client.anInt9256++;
										}
									}
									client.anInt9257 = 2;
									client.anInt9023 = client.anInt9268;
									var26 = false;
									var5 = client.anInt9256;
									while (var5 > 0) {
										var26 = true;
										var5--;
										for (var33 = 0; var33 < var5; var33++) {
											boolean var117 = false;
											Class99 var110 = client.aClass99Array9259[var33];
											Class99 var116 = client.aClass99Array9259[var33 + 1];
											if (Class507.aClass498_5930.anInt5889 != var110.anInt911 && var116.anInt911 == Class507.aClass498_5930.anInt5889) {
												var117 = true;
											}
											if (!var117 && var110.anInt911 == 0 && var116.anInt911 != 0) {
												var117 = true;
											}
											if (!var117 && !var110.aBoolean909 && var116.aBoolean909) {
												var117 = true;
											}
											if (var117) {
												Class99 var90 = client.aClass99Array9259[var33];
												client.aClass99Array9259[var33] = client.aClass99Array9259[var33 + 1];
												client.aClass99Array9259[var33 + 1] = var90;
												var26 = false;
											}
										}
										if (var26) {
											if (arg1 <= 5) {
												throw new IllegalStateException();
											}
											break;
										}
									}
									arg0.currentIncomingPacket = null;
									return true;
								} else if (INTERFACE_SPRIT_PACKET == arg0.currentIncomingPacket) {
									var27 = var3.readLEInt(17871800);
									var5 = var3.readInt1((byte) 2);
									Class263_Sub3.method2630((byte) -32);
									Class418.method5275(var5, var27, -403992181);
									arg0.currentIncomingPacket = null;
									return true;
								} else if (arg0.currentIncomingPacket == aClass222_2348) {
									client.anInt9129 = client.anInt9268;
									var26 = var3.readUnsignedByte(-41972783) == 1;
									Class170 var125 = new Class170(var3);
									Class154 var126;
									if (var26) {
										var126 = CacheIndex.aClass154_1450;
									} else {
										var126 = Class412.aClass154_4258;
									}
									var125.method2037(var126, 2005549821);
									arg0.currentIncomingPacket = null;
									return true;
								} else if (ITEM_ON_INTERFACE_PACKET == arg0.currentIncomingPacket) {
									var27 = var3.readLEInt(79079617);
									var5 = var3.readUnsignedLEShort(15163594);
									if (var5 == 65535) {
										var5 = -1;
									}
									var33 = var3.readInt((byte) 23);
									Class263_Sub3.method2630((byte) -59);
									Class475_Sub4.method5957(var27, var5, var33, 2131353002);
									ItemDefinitions var115 = Class556.aClass510_6392.getItemDefinitions(var5, (byte) -51);
									Class228.method2316(var27, var115.modelRotation1, var115.modelRotation2, var115.modelZoom, -563985587);
									Class123.method1512(var27, var115.modelOffset1, var115.modelOffset2, var115.anInt6717, (byte) -72);
									arg0.currentIncomingPacket = null;
									return true;
								} else {
									byte var34;
									if (VARP1_PACKET == arg0.currentIncomingPacket) {
										var27 = var3.readUnsignedLEShort(15163594);
										var34 = var3.readByte((byte) 39);
										Class158.aClass561_6474.sendConfig(var27, var34, -1099000711);
										arg0.currentIncomingPacket = null;
										return true;
									} else if (aClass222_2302 == arg0.currentIncomingPacket) {
										var27 = var3.readInt2(-793658723);
										var5 = var3.readUnsignedLEShort(15163594);
										var33 = var3.readUnsignedShortA((byte) -43);
										var31 = var3.readUnsignedShortA((byte) -74);
										Class263_Sub3.method2630((byte) -13);
										Class134.method1577(var27, 7, var5 << 16 | var31, var33, 1533112188);
										arg0.currentIncomingPacket = null;
										return true;
									} else {
										int var16;
										int var17;
										int var61;
										int var102;
										if (arg0.currentIncomingPacket == aClass222_2342) {
											var27 = var3.readUnsignedByteC(-243015761);
											var5 = var3.readUnsignedByteC(-243015761) * 4;
											var33 = var3.method3801((byte) 0);
											byte var111 = var3.readByte((byte) 13);
											var35 = var3.readUnsignedShortA((byte) -102);
											var37 = var3.readUnsignedLEShortA(-1183541044);
											var10 = var3.readUnsignedShort(449606983);
											var11 = var3.readUnsignedShortA((byte) -31);
											var12 = var3.readUnsignedByte(1147067054);
											if (var12 == 255) {
												var12 = -1;
											}
											var53 = var3.readUnsignedByteA(-741334169);
											var61 = var3.readUnsignedShort(1771761051);
											var70 = var3.readUnsignedShortA((byte) -2);
											byte var107 = var3.readByteC(-1921170978);
											var17 = var3.readShort(-1100583751);
											boolean var100 = (var27 & 0x1) != 0;
											boolean var109 = (var27 & 0x2) != 0;
											var102 = var109 ? var27 >> 2 : -1;
											if (var109) {
												var53 = (byte) var53;
											} else {
												var53 *= 4;
											}
											Class381 var106 = client.aClass304_9030.method3022(-136879538);
											int var108 = var35 - var106.gameSceneBaseX * 2;
											int var23 = var61 - var106.gameSceneBaseY * 2;
											var16 = var107 + var108;
											var31 = var111 + var23;
											if (var108 >= 0 && var23 >= 0 && var108 < client.aClass304_9030.method2990(-1667294495) * 2 && var23 < client.aClass304_9030.method2990(-1129238636) * 2 && var16 >= 0 && var31 >= 0 && var16 < client.aClass304_9030.method3033((byte) -37) * 2 && var31 < client.aClass304_9030.method3033((byte) 6) * 2 && var70 != 65535) {
												var108 = var108 * 256;
												var23 *= 256;
												var16 *= 256;
												var31 = var31 * 256;
												var53 <<= 0x2;
												var5 <<= 0x2;
												var10 <<= 0x2;
												Class288.method2889(var70, var33, var17, var102, var53, var5, var108, var23, var16, var31, var11, var37, var12, var10, var100, 0, -1810287182);
											}
											arg0.currentIncomingPacket = null;
											return true;
										} else if (aClass222_2192 == arg0.currentIncomingPacket) {
											Class263_Sub2.method2625((byte) 119);
											arg0.currentIncomingPacket = null;
											return true;
										} else if (PLAYERS_UPDATE_PACKET == arg0.currentIncomingPacket) {
											Class537.method6323(var3, arg0.anInt26, 1270159900);
											arg0.currentIncomingPacket = null;
											return true;
										} else if (arg0.currentIncomingPacket == aClass222_2257) {
											var26 = var3.readUnsignedByteS(-400233324) == 1;
											var5 = var3.readLEInt(1878176116);
											Class263_Sub3.method2630((byte) -94);
											Class76_Sub2_Sub1.method915(var5, var26, (byte) -53);
											arg0.currentIncomingPacket = null;
											return true;
										} else if (arg0.currentIncomingPacket == aClass222_2320) {
											Class204.method2182(Class213.aClass213_2075, 1543610202);
											arg0.currentIncomingPacket = null;
											return true;
										} else if (aClass222_2230 == arg0.currentIncomingPacket) {
											Class263_Sub3.method2630((byte) -82);
											Class166_Sub1.method1998((byte) 76);
											arg0.currentIncomingPacket = null;
											return true;
										} else if (arg0.currentIncomingPacket == aClass222_2250) {
											var30 = new byte[arg0.anInt26];
											var3.method3828(var30, 0, arg0.anInt26, 1689124730);
											var28 = Class125.method1525(var30, 0, arg0.anInt26, (byte) 1);
											if (client.aBoolean9198) {
												try {
													Class232.aClass232_2463.method2355(new Object[] { var28 }, -390918712);
												} catch (Throwable var24) {
												}
											}
											arg0.currentIncomingPacket = null;
											return true;
										} else if (arg0.currentIncomingPacket == SOUND_INDEX14_PACKET) {
											var27 = var3.readUnsignedShort(2119426489);
											if (var27 == 65535) {
												var27 = -1;
											}
											var5 = var3.readUnsignedByte(1704805286);
											var33 = var3.readUnsignedShort(308544235);
											var31 = var3.readUnsignedByte(1195504038);
											var35 = var3.readUnsignedShort(861141133);
											Class115.method1415(var27, var5, var33, var31, var35, (byte) -1);
											arg0.currentIncomingPacket = null;
											return true;
										} else {
											Class330_Sub2 var62;
											Class330_Sub2 var65;
											if (arg0.currentIncomingPacket == aClass222_2313) {
												var27 = var3.readInt((byte) 118);
												var5 = var3.readUnsignedShort(370248487);
												if (var5 == 65535) {
													var5 = -1;
												}
												var33 = var3.readUnsignedShortA((byte) -114);
												if (var33 == 65535) {
													var33 = -1;
												}
												var31 = var3.readUnsignedShort(1015482386);
												Class263_Sub3.method2630((byte) -6);
												for (var35 = var33; var35 <= var5; var35++) {
													var9 = (long) var35 + ((long) var27 << 32);
													var62 = (Class330_Sub2) client.aClass497_9211.method6094(var9);
													if (var62 != null) {
														var65 = new Class330_Sub2(var62.anInt7510, var31);
														var62.method3252(388187907);
													} else if (var35 == -1) {
														var65 = new Class330_Sub2(Class95.method1101(var27, 29266536).aClass330_Sub2_1273.anInt7510, var31);
													} else {
														var65 = new Class330_Sub2(0, var31);
													}
													client.aClass497_9211.method6097(var65, var9);
												}
												arg0.currentIncomingPacket = null;
												return true;
											} else if (aClass222_2275 == arg0.currentIncomingPacket) {
												var3.offset += 28;
												if (var3.method3776(1250364350)) {
													Class79.method943(var3, var3.offset - 28, -835307723);
												}
												arg0.currentIncomingPacket = null;
												return true;
											} else if (arg0.currentIncomingPacket == aClass222_2194) {
												var27 = var3.readInt((byte) 4);
												var5 = var3.readLEInt(-2072128558);
												Class381 var124 = new Class381(var3.readInt2(-793658723));
												var31 = var3.readInt2(-793658723);
												var35 = var3.readInt((byte) 101);
												var37 = var3.readLEInt(-882162775);
												var10 = var3.readUnsignedByteS(-400233324);
												var11 = var3.readUnsignedByteS(-400233324);
												var12 = var11 >> 2;
												var53 = var11 & 0x3;
												var61 = var3.readUnsignedLEShort(15163594);
												var70 = var3.readInt((byte) 29);
												Class263_Sub3.method2630((byte) -5);
												Class423.method5302(var31, new Class330_Sub48_Sub2(var61, var10, new Class427(var124, var12, var53, var27)), new int[] { var35, var5, var37, var70 }, false, (short) 16385);
												arg0.currentIncomingPacket = null;
												return true;
											} else if (arg0.currentIncomingPacket == aClass222_2197) {
												client.anInt9160 = var3.readShort(-1100583751);
												client.anInt9208 = client.anInt9268;
												arg0.currentIncomingPacket = null;
												return true;
											} else if (aClass222_2227 == arg0.currentIncomingPacket) {
												var27 = var3.readUnsignedByte(535010269);
												Class470 var123 = (Class470) Class479.method6015(Class416.method5255(1588658766), var27, (byte) 90);
												if (var123 == null) {
													var123 = Class470.aClass470_6869;
												}
												Class279.method2746(var123, -1366788533);
												arg0.currentIncomingPacket = null;
												return true;
											} else if (aClass222_2312 == arg0.currentIncomingPacket) {
												Class204.method2182(Class213.aClass213_2066, 1806687096);
												arg0.currentIncomingPacket = null;
												return true;
											} else if (aClass222_2245 == arg0.currentIncomingPacket) {
												var27 = var3.readInt((byte) 29);
												Class263_Sub3.method2630((byte) -90);
												Class134.method1577(var27, 5, client.anInt9121, 0, 1910565966);
												arg0.currentIncomingPacket = null;
												return true;
											} else if (arg0.currentIncomingPacket == NPC_UPDATE_PACKET) {
												Class230.method2343(false, -387887132);
												arg0.currentIncomingPacket = null;
												return true;
											} else if (arg0.currentIncomingPacket == aClass222_2332) {
												var27 = var3.readUnsignedShort(505367749);
												Class72.method828(var27, (byte) 101);
												arg0.currentIncomingPacket = null;
												return true;
											} else if (arg0.currentIncomingPacket == VARP2_PACKET) {
												var27 = var3.readInt2(-793658723);
												var5 = var3.readUnsignedShortA((byte) -107);
												Class158.aClass561_6474.sendConfig(var5, var27, -1099000711);
												arg0.currentIncomingPacket = null;
												return true;
											} else if (arg0.currentIncomingPacket == JOIN_CLAN_CHANNEL_PACKET) {
												client.anInt9181 = client.anInt9268;
												var26 = var3.readUnsignedByte(737631490) == 1;
												if (arg0.anInt26 != 1) {
													if (var26) {
														Class106.aClass330_Sub39_1009 = new Class330_Sub39(var3);
													} else {
														Class_ra_Sub3.aClass330_Sub39_8652 = new Class330_Sub39(var3);
													}
													arg0.currentIncomingPacket = null;
													return true;
												}
												if (var26) {
													Class106.aClass330_Sub39_1009 = null;
												} else {
													Class_ra_Sub3.aClass330_Sub39_8652 = null;
												}
												arg0.currentIncomingPacket = null;
												return true;
											} else if (arg0.currentIncomingPacket == CONFIG_BY_FILE1_PACKET) {
												var27 = var3.readUnsignedByteA(-741334169);
												var5 = var3.readUnsignedLEShortA(970841134);
												Class158.aClass561_6474.sendConfigByFile(var5, var27, 16711935);
												arg0.currentIncomingPacket = null;
												return true;
											} else if (arg0.currentIncomingPacket == aClass222_2287) {
												var27 = var3.readUnsignedShort(1593170244);
												if (var27 == 65535) {
													var27 = -1;
												}
												var5 = var3.readUnsignedByte(350342883);
												var33 = var3.readUnsignedShort(104850184);
												var31 = var3.readUnsignedByte(-312083744);
												var35 = var3.readUnsignedShort(1659175048);
												Class197.method2147(var27, var5, var33, var31, false, var35, -1019729296);
												arg0.currentIncomingPacket = null;
												return true;
											} else if (arg0.currentIncomingPacket == aClass222_2318) {
												Preferences.method2928(var3.readString(1457499185), -1775509070);
												arg0.currentIncomingPacket = null;
												return true;
											} else if (arg0.currentIncomingPacket == aClass222_2271) {
												var27 = var3.readInt2(-793658723);
												var5 = var3.readUnsignedByteS(-400233324);
												var33 = var3.readUnsignedLEShort(15163594);
												var31 = var3.readUnsignedLEShort(15163594);
												Class263_Sub3.method2630((byte) -110);
												Class432_Sub1_Sub3_Sub2.method5534(var27, var5, var31, var33, 1218955319);
												arg0.currentIncomingPacket = null;
												return true;
											} else {
												boolean var63;
												if (arg0.currentIncomingPacket == SEND_ITEMS_PACKET) {
													var27 = var3.readUnsignedShort(1614115364);
													var5 = var3.readUnsignedByte(876389591);
													var63 = (var5 & 0x1) == 1;
													Class473.method5912(var27, var63, -1295864621);
													var31 = var3.readUnsignedShort(1114858842);
													for (var35 = 0; var35 < var31; var35++) {
														var37 = var3.readUnsignedByteA(-741334169);
														if (var37 == 255) {
															var37 = var3.readInt1((byte) 2);
														}
														var10 = var3.readUnsignedShortA((byte) -115);
														Class88.method1054(var27, var35, var10 - 1, var37, var63, -1424974565);
													}
													client.anIntArray9187[++client.anInt9188 - 1 & 0x1F] = var27;
													arg0.currentIncomingPacket = null;
													return true;
												} else if (arg0.currentIncomingPacket == aClass222_2254) {
													var27 = var3.readUnsignedByte(952039832);
													var5 = var3.readBigSmart(-854154941);
													if (client.aClass327Array8999[var27] != null) {
														client.aClass327Array8999[var27].method3234(client.aClass304_9030.method3023(-400722441), -1282901725);
														client.aClass327Array8999[var27] = null;
													}
													if (var5 != -1) {
														client.aClass327Array8999[var27] = new Class327(Class361.aClass_ra3793, var3, var5);
														client.aClass327Array8999[var27].method3233(client.aClass304_9030.method3023(-400722441), (byte) 0);
													}
													arg0.currentIncomingPacket = null;
													return true;
												} else if (arg0.currentIncomingPacket == CAMERA_POSITION_PACKET) {
													var27 = var3.readUnsignedByte(1938508456);
													var5 = var3.readUnsignedByteS(-400233324);
													var33 = var3.readUnsignedByteA(-741334169);
													var31 = var3.readUnsignedLEShortA(-177515651) << 2;
													var35 = var3.readUnsignedByteA(-741334169);
													Class263_Sub3.method2630((byte) -92);
													Class437.method5587(var5, var35, var31, var33, var27, true, (byte) 14);
													arg0.currentIncomingPacket = null;
													return true;
												} else if (aClass222_2238 == arg0.currentIncomingPacket) {
													Class204.method2182(Class213.aClass213_2073, -1227417923);
													arg0.currentIncomingPacket = null;
													return true;
												} else if (GAME_BAR_STAGES_PACKET == arg0.currentIncomingPacket) {
													client.anInt9227 = var3.readUnsignedByteC(-243015761);
													client.anInt9264 = var3.readUnsignedByteS(-400233324);
													arg0.currentIncomingPacket = null;
													return true;
												} else if (aClass222_2283 == arg0.currentIncomingPacket) {
													Class204.method2182(Class213.aClass213_2071, 2118646851);
													arg0.currentIncomingPacket = null;
													return true;
												} else if (CUTSCENE_PACKET == arg0.currentIncomingPacket) {
													var27 = var3.readUnsignedShort(-384319976);
													client.anInt9040 = -1;
													client.anInt9265 = var27;
													client.anInt8987 = 4;
													Class76_Sub1.aClass280_7096.method2750(client.anInt9265, -1715573463);
													Class513.method6194((byte) 17);
													Class_ta.method5676(1217282492);
													var5 = var3.readUnsignedShort(284626571);
													Class140_Sub1.anIntArrayArray7262 = new int[var5][4];
													for (var33 = 0; var33 < var5; var33++) {
														for (var31 = 0; var31 < 4; var31++) {
															Class140_Sub1.anIntArrayArray7262[var33][var31] = var3.readInt((byte) 15);
														}
													}
													var33 = var3.readUnsignedByte(1587415762);
													Class444.aClass330_Sub46_4496 = new Buffer(var33);
													Class444.aClass330_Sub46_4496.method3749(var3.payload, var3.offset, var33, (byte) 45);
													var3.offset += var33;
													arg0.currentIncomingPacket = null;
													return false;
												} else if (WORLD_TILE_PACKET == arg0.currentIncomingPacket) {
													Class1.anInt39 = var3.readUnsignedByte(903435007);
													IsaacCipher.anInt5837 = var3.readByteC(-2067496350) << 3;
													Class153.anInt1634 = var3.readByteC(-2143138940) << 3;
													arg0.currentIncomingPacket = null;
													return true;
												} else if (arg0.currentIncomingPacket == ITEM_WEIGHT_PACKET) {
													var27 = var3.readUnsignedShort(331295435);
													var28 = var3.readString(738620093);
													var63 = var3.readUnsignedByte(1598620189) == 1;
													Class357.aClass498_3703 = Class507.aClass498_5930;
													Class330_Sub3.aBoolean7514 = var63;
													IndexTable.method2783(var27, var28, -428054553);
													Class227.method2311(0, -1188873169);
													arg0.currentIncomingPacket = null;
													return false;
												} else {
													int var18;
													long var52;
													boolean var88;
													if (arg0.currentIncomingPacket == aClass222_2208) {
														var26 = var3.readUnsignedByte(1890975973) == 1;
														var28 = var3.readString(-133006074);
														var6 = var28;
														if (var26) {
															var6 = var3.readString(1360282706);
														}
														var7 = var3.readLong(-687700802);
														var9 = var3.readUnsignedShort(125498032);
														var52 = var3.readUnsignedTriByte(-1401356047);
														var53 = var3.readUnsignedByte(893638496);
														var61 = var3.readUnsignedShort(1654584233);
														long var81 = (var9 << 32) + var52;
														var88 = false;
														var18 = 0;
														while (true) {
															if (var18 >= 100) {
																if (var53 <= 1 && Class65.foundPlayer(var6, -56580872)) {
																	var88 = true;
																}
																break;
															}
															if (client.aLongArray9064[var18] == var81) {
																var88 = true;
																break;
															}
															var18++;
														}
														if (!var88) {
															client.aLongArray9064[client.anInt9190] = var81;
															client.anInt9190 = (client.anInt9190 + 1) % 100;
															String var99 = Class2.aClass523_44.method6233(var61, 1627805447).method3457(var3, 1850474658);
															if (var53 == 2) {
																Class81.sendSpeech(20, 0, Class325_Sub4.method3225(1, 1409982546) + var28, Class325_Sub4.method3225(1, -1777400868) + var6, var28, var99, Class211.method2222(var7), var61, (byte) 62);
															} else if (var53 == 1) {
																Class81.sendSpeech(20, 0, Class325_Sub4.method3225(0, 791904680) + var28, Class325_Sub4.method3225(0, -944386485) + var6, var28, var99, Class211.method2222(var7), var61, (byte) 58);
															} else {
																Class81.sendSpeech(20, 0, var28, var6, var28, var99, Class211.method2222(var7), var61, (byte) 74);
															}
														}
														arg0.currentIncomingPacket = null;
														return true;
													} else if (MINIMAP_STATUS_PACKET == arg0.currentIncomingPacket) {
														Class9.anInt140 = var3.readUnsignedByte(822279483);
														arg0.currentIncomingPacket = null;
														return true;
													} else if (REMOVE_GROUND_ITEM_PACKET == arg0.currentIncomingPacket) {
														Class204.method2182(Class213.aClass213_2072, 2098230110);
														arg0.currentIncomingPacket = null;
														return true;
													} else {
														Class330_Sub46_Sub2 var56;
														if (arg0.currentIncomingPacket == MAP_REGION_PACKET) {
															var56 = new Class330_Sub46_Sub2(arg0.anInt26);
															System.arraycopy(arg0.aClass330_Sub46_Sub2_17.payload, arg0.aClass330_Sub46_Sub2_17.offset, var56.payload, 0, arg0.anInt26);
															Class490.method6070(1018061315);
															if (Class448.aClass330_Sub50_5555.aClass464_Sub24_7904.method5825((byte) -17) == 1) {
																Class43.aClass276_10073.method2725(new Class300(OutgoingPacketManager.aClass310_3210, var56), (byte) 69);
															} else {
																client.aClass304_9030.method3026(new Class300(OutgoingPacketManager.aClass310_3210, var56), 2025629542);
															}
															arg0.currentIncomingPacket = null;
															return false;
														} else if (arg0.currentIncomingPacket == aClass222_2196) {
															var27 = var3.readInt((byte) 72);
															var5 = var3.readUnsignedShort(462810155);
															var33 = var3.readLEInt(-1474622740);
															Class263_Sub3.method2630((byte) -58);
															Class134.method1577(var27, 5, var5, var33, 2005541031);
															arg0.currentIncomingPacket = null;
															return true;
														} else if (arg0.currentIncomingPacket == aClass222_2266) {
															var26 = var3.readUnsignedByte(-230332474) == 1;
															var5 = var3.readInt2(-793658723);
															if (var26 != Class330_Sub36.aBoolean7737 || Class330_Sub10.anInt7590 != var5) {
																Class330_Sub36.aBoolean7737 = var26;
																Class330_Sub10.anInt7590 = var5;
																Class230.method2339(Class545.aClass545_7003, -1, -1, 338846247);
															}
															arg0.currentIncomingPacket = null;
															return true;
														} else {
															long var44;
															long var68;
															Class330_Sub39 var69;
															String var79;
															if (RECEIVE_CLAN_QUICKCHAT_MESSAGE_PACKET == arg0.currentIncomingPacket) {
																var26 = var3.readUnsignedByte(1767452287) == 1;
																var28 = var3.readString(1471271186);
																var68 = var3.readUnsignedShort(1675192756);
																var44 = var3.readUnsignedTriByte(-1401356047);
																var10 = var3.readUnsignedByte(-178615331);
																var11 = var3.readUnsignedShort(1962991193);
																var80 = (var68 << 32) + var44;
																var67 = false;
																var69 = null;
																Class330_Sub39 var105 = var26 ? Class106.aClass330_Sub39_1009 : Class_ra_Sub3.aClass330_Sub39_8652;
																if (var105 == null) {
																	var67 = true;
																} else {
																	var17 = 0;
																	while (true) {
																		if (var17 >= 100) {
																			if (var10 <= 1 && Class65.foundPlayer(var28, -1595229469)) {
																				var67 = true;
																			}
																			break;
																		}
																		if (client.aLongArray9064[var17] == var80) {
																			var67 = true;
																			break;
																		}
																		var17++;
																	}
																}
																if (!var67) {
																	client.aLongArray9064[client.anInt9190] = var80;
																	client.anInt9190 = (client.anInt9190 + 1) % 100;
																	var79 = Class2.aClass523_44.method6233(var11, 1082439719).method3457(var3, 2104386322);
																	var18 = var26 ? 42 : 45;
																	if (var10 == 2 || var10 == 3) {
																		Class81.sendSpeech(var18, 0, Class325_Sub4.method3225(1, 1756600827) + var28, Class325_Sub4.method3225(1, -1664418511) + var28, var28, var79, var105.aString7757, var11, (byte) 73);
																	} else if (var10 == 1) {
																		Class81.sendSpeech(var18, 0, Class325_Sub4.method3225(0, 2111141153) + var28, Class325_Sub4.method3225(0, 195438119) + var28, var28, var79, var105.aString7757, var11, (byte) 32);
																	} else {
																		Class81.sendSpeech(var18, 0, var28, var28, var28, var79, var105.aString7757, var11, (byte) 100);
																	}
																}
																arg0.currentIncomingPacket = null;
																return true;
															} else if (aClass222_2249 == arg0.currentIncomingPacket) {
																Class1.anInt39 = var3.readUnsignedByteC(-243015761);
																IsaacCipher.anInt5837 = var3.readByteA(-838454832) << 3;
																Class153.anInt1634 = var3.readByteC(-2002872660) << 3;
																Class381 var122 = client.aClass304_9030.method3022(-1623295537);
																for (Class330_Sub9 var118 = (Class330_Sub9) client.aClass497_9138.method6099((byte) 48); var118 != null; var118 = (Class330_Sub9) client.aClass497_9138.method6098((short) -32768)) {
																	var33 = (int) (var118.aLong3341 >> 28 & 0x3L);
																	var31 = (int) (var118.aLong3341 & 0x3FFFL);
																	var35 = var31 - var122.gameSceneBaseX;
																	var37 = (int) (var118.aLong3341 >> 14 & 0x3FFFL);
																	var10 = var37 - var122.gameSceneBaseY;
																	if (var33 == Class1.anInt39 && var35 >= Class153.anInt1634 && var35 < Class153.anInt1634 + 8 && var10 >= IsaacCipher.anInt5837 && var10 < IsaacCipher.anInt5837 + 8) {
																		var118.method3252(1498984882);
																		if (var35 >= 0 && var10 >= 0 && var35 < client.aClass304_9030.method2990(-585228026) && var10 < client.aClass304_9030.method3033((byte) -108)) {
																			Class343.method4001(Class1.anInt39, var35, var10, -334637075);
																		}
																	}
																}
																Class330_Sub10 var120;
																for (var120 = (Class330_Sub10) Class330_Sub10.aClass471_7587.method5869(539664854); var120 != null; var120 = (Class330_Sub10) Class330_Sub10.aClass471_7587.method5873((byte) -36)) {
																	if (var120.anInt7582 >= Class153.anInt1634 && var120.anInt7582 < Class153.anInt1634 + 8 && var120.anInt7577 >= IsaacCipher.anInt5837 && var120.anInt7577 < IsaacCipher.anInt5837 + 8 && var120.anInt7581 == Class1.anInt39) {
																		var120.aBoolean7586 = true;
																	}
																}
																for (var120 = (Class330_Sub10) Class330_Sub10.aClass471_7588.method5869(539664854); var120 != null; var120 = (Class330_Sub10) Class330_Sub10.aClass471_7588.method5873((byte) 9)) {
																	if (var120.anInt7582 >= Class153.anInt1634 && var120.anInt7582 < Class153.anInt1634 + 8 && var120.anInt7577 >= IsaacCipher.anInt5837 && var120.anInt7577 < IsaacCipher.anInt5837 + 8 && Class1.anInt39 == var120.anInt7581) {
																		var120.aBoolean7586 = true;
																	}
																}
																arg0.currentIncomingPacket = null;
																return true;
															} else if (arg0.currentIncomingPacket == UPDATE_ITEMS_PACKET) {
																var27 = var3.readUnsignedShort(307095930);
																var5 = var3.readUnsignedByte(1074636966);
																var63 = (var5 & 0x1) == 1;
																while (var3.offset < arg0.anInt26) {
																	var31 = var3.readSmart(-611134765);
																	var35 = var3.readUnsignedShort(1076638498);
																	var37 = 0;
																	if (var35 != 0) {
																		var37 = var3.readUnsignedByte(1103320415);
																		if (var37 == 255) {
																			var37 = var3.readInt((byte) 80);
																		}
																	}
																	Class88.method1054(var27, var31, var35 - 1, var37, var63, -1424974565);
																}
																client.anIntArray9187[++client.anInt9188 - 1 & 0x1F] = var27;
																arg0.currentIncomingPacket = null;
																return true;
															} else if (PLAYER_ON_INTERFACE_PACKET == arg0.currentIncomingPacket) {
																var27 = var3.readInt1((byte) 2);
																Class263_Sub3.method2630((byte) -47);
																Class134.method1577(var27, 3, client.anInt9121, 0, 2009983975);
																arg0.currentIncomingPacket = null;
																return true;
															} else if (aClass222_2295 == arg0.currentIncomingPacket) {
																var27 = var3.readUnsignedShort(2110953313);
																var5 = var3.readInt((byte) 49);
																Class263_Sub3.method2630((byte) -79);
																Class461.method5701(var5, var27, 612169738);
																arg0.currentIncomingPacket = null;
																return true;
															} else if (arg0.currentIncomingPacket == GROUND_ITEM_PACKET) {
																Class204.method2182(Class213.aClass213_2074, 1321498744);
																arg0.currentIncomingPacket = null;
																return true;
															} else if (MUSIC_PACKET == arg0.currentIncomingPacket) {
																var27 = var3.readUnsignedByteS(-400233324);
																var5 = var3.readUnsignedByteC(-243015761);
																var33 = var3.readUnsignedShort(765264701);
																if (var33 == 65535) {
																	var33 = -1;
																}
																Class18.method452(var33, var27, var5, 1839365861);
																arg0.currentIncomingPacket = null;
																return true;
															} else if (arg0.currentIncomingPacket == aClass222_2241) {
																var27 = var3.readInt((byte) 19);
																var5 = var3.readInt2(-793658723);
																var33 = var3.readUnsignedLEShortA(-124742140);
																Class263_Sub3.method2630((byte) -117);
																Class134.method1577(var5, 3, var33, var27, 2035333022);
																arg0.currentIncomingPacket = null;
																return true;
															} else {
																String var32;
																if (arg0.currentIncomingPacket == aClass222_2303) {
																	var32 = var3.readString(1700264470);
																	Console.execute(var32);
																	arg0.currentIncomingPacket = null;
																	return true;
																} else if (arg0.currentIncomingPacket == aClass222_2204) {
																	var27 = var3.readUnsignedLEShortA(1295932173);
																	var5 = var3.readUnsignedByteA(-741334169);
																	var33 = var3.readUnsignedLEShort(15163594);
																	var31 = var3.readLEInt(180647467);
																	Class263_Sub3.method2630((byte) -79);
																	Class521.method6225(var31, var5, var27, var33, -121826812);
																	arg0.currentIncomingPacket = null;
																	return true;
																} else if (SOUND_EFFECT_PACKET == arg0.currentIncomingPacket) {
																	var27 = var3.read24BitUnsignedIntegerV2((byte) 71);
																	var5 = var3.readUnsignedShort(-164705324);
																	if (var5 == 65535) {
																		var5 = -1;
																	}
																	var33 = var3.readUnsignedByteS(-400233324);
																	Class62.method767(var5, var27, var33, 889451349);
																	arg0.currentIncomingPacket = null;
																	return true;
																} else if (arg0.currentIncomingPacket == aClass222_2210) {
																	var27 = var3.readInt1((byte) 2);
																	var5 = var3.readInt((byte) 13);
																	var33 = var3.readInt2(-793658723);
																	var31 = var3.readInt1((byte) 2);
																	var35 = var3.readUnsignedShortA((byte) -42);
																	var37 = var3.readLEInt(-479634473);
																	var10 = var3.readUnsignedByteS(-400233324);
																	var11 = var3.readUnsignedShortA((byte) -91);
																	Class263_Sub3.method2630((byte) -16);
																	Class423.method5302(var33, new Class330_Sub48_Sub3(var11, var10, var35), new int[] { var5, var27, var31, var37 }, false, (short) 16385);
																	arg0.currentIncomingPacket = null;
																	return true;
																} else if (aClass222_2255 == arg0.currentIncomingPacket) {
																	var27 = var3.readUnsignedLEShortA(1559589562);
																	var5 = var3.readUnsignedShortA((byte) -6);
																	var33 = var3.readInt2(-793658723);
																	Class263_Sub3.method2630((byte) -127);
																	Class330_Sub12_Sub6.method3305(var33, (var27 << 16) + var5, 14451499);
																	arg0.currentIncomingPacket = null;
																	return true;
																} else if (SET_MOUSE_PACKET == arg0.currentIncomingPacket) {
																	Class276.aString2861 = arg0.anInt26 > 2 ? var3.readString(151563408) : Class526.aClass526_6166.method6257(Class429.aClass454_4369, 991479434);
																	client.anInt9137 = arg0.anInt26 > 0 ? var3.readUnsignedShort(1768918355) : -1;
																	if (client.anInt9137 == 65535) {
																		client.anInt9137 = -1;
																	}
																	arg0.currentIncomingPacket = null;
																	return true;
																} else if (PLAYER_OPTION_PACKET == arg0.currentIncomingPacket) {
																	var32 = var3.readString(540768413);
																	var5 = var3.readUnsignedByteS(-400233324);
																	var33 = var3.readUnsignedShortA((byte) -84);
																	if (var33 == 65535) {
																		var33 = -1;
																	}
																	var31 = var3.readUnsignedByteA(-741334169);
																	if (var5 >= 1 && var5 <= 8) {
																		if (var32.equalsIgnoreCase("null")) {
																			var32 = null;
																		}
																		client.aStringArray9167[var5 - 1] = var32;
																		client.anIntArray9134[var5 - 1] = var33;
																		client.aBooleanArray9136[var5 - 1] = var31 == 0;
																	}
																	arg0.currentIncomingPacket = null;
																	return true;
																} else {
																	long var29;
																	if (aClass222_2207 == arg0.currentIncomingPacket) {
																		var27 = var3.readUnsignedShort(1671227642);
																		var29 = var3.readLong(78006376);
																		if (Class332.anObjectArray6640 == null) {
																			Class332.anObjectArray6640 = new Object[Class95_Sub7.aClass536_7157.anInt6230];
																		}
																		Class332.anObjectArray6640[var27] = Long.valueOf(var29);
																		client.anIntArray9195[++client.anInt9196 - 1 & 0x1F] = var27;
																		arg0.currentIncomingPacket = null;
																		return true;
																	} else if (arg0.currentIncomingPacket == aClass222_2223) {
																		var27 = var3.readUnsignedShort(850301831);
																		var28 = var3.readString(-619417190);
																		if (Class332.anObjectArray6640 == null) {
																			Class332.anObjectArray6640 = new Object[Class95_Sub7.aClass536_7157.anInt6230];
																		}
																		Class332.anObjectArray6640[var27] = var28;
																		client.anIntArray9195[++client.anInt9196 - 1 & 0x1F] = var27;
																		arg0.currentIncomingPacket = null;
																		return true;
																	} else if (GAME_INTERFACE_PACKET == arg0.currentIncomingPacket) {
																		var27 = var3.readUnsignedByteS(-400233324);
																		var5 = var3.readUnsignedLEShortA(1937198032);
																		var33 = var3.readInt2(-793658723);
																		var31 = var3.readInt2(-793658723);
																		var35 = var3.readInt1((byte) 2);
																		var37 = var3.readInt2(-793658723);
																		var10 = var3.readInt((byte) 118);
																		System.out.println("Overlay: " + var27 + ", Interface ID: " + var5 + ", Window Hash = " + var33);
																		Class263_Sub3.method2630((byte) -81);
																		Class423.method5302(var33, new Class330_Sub48(var5, var27), new int[] { var31, var35, var10, var37 }, false, (short) 16385);
																		arg0.currentIncomingPacket = null;
																		return true;
																	} else if (aClass222_2326 == arg0.currentIncomingPacket) {
																		var26 = var3.readUnsignedByte(959323780) == 1;
																		var28 = var3.readString(104924925);
																		var6 = var28;
																		if (var26) {
																			var6 = var3.readString(193968778);
																		}
																		var31 = var3.readUnsignedByte(1282493055);
																		var35 = var3.readUnsignedShort(980299530);
																		var39 = false;
																		if (var31 <= 1 && Class65.foundPlayer(var6, -28797826)) {
																			var39 = true;
																		}
																		if (!var39) {
																			var57 = Class2.aClass523_44.method6233(var35, 1055327717).method3457(var3, 18923371);
																			if (var31 == 2) {
																				Class81.sendSpeech(25, 0, Class325_Sub4.method3225(1, 1633376072) + var28, Class325_Sub4.method3225(1, 1825382120) + var6, var28, var57, null, var35, (byte) 13);
																			} else if (var31 == 1) {
																				Class81.sendSpeech(25, 0, Class325_Sub4.method3225(0, 727795150) + var28, Class325_Sub4.method3225(0, 16890533) + var6, var28, var57, null, var35, (byte) 107);
																			} else {
																				Class81.sendSpeech(25, 0, var28, var6, var28, var57, null, var35, (byte) 124);
																			}
																		}
																		arg0.currentIncomingPacket = null;
																		return true;
																	} else if (aClass222_2246 == arg0.currentIncomingPacket) {
																		var27 = var3.readUnsignedByte(-304703759);
																		var5 = var3.readInt1((byte) 2);
																		var33 = var3.readInt2(-793658723);
																		var31 = var3.readUnsignedByte(1748519037);
																		var35 = var3.readUnsignedByte(62912620);
																		var37 = var5 >> 28;
																		var10 = var5 >> 14 & 0x3FFF;
																		var11 = var5 & 0x3FFF;
																		Class_ra.method4808(var37, var10, var11, var27, var35, var33, var31, -1973334292);
																		arg0.currentIncomingPacket = null;
																		return true;
																	} else if (aClass222_2344 == arg0.currentIncomingPacket) {
																		Class204.method2182(Class213.aClass213_2067, -175679184);
																		arg0.currentIncomingPacket = null;
																		return true;
																	} else if (arg0.currentIncomingPacket == RUN_ENERGY_PACKET) {
																		client.anInt9159 = var3.readUnsignedByte(142775009);
																		client.anInt9208 = client.anInt9268;
																		arg0.currentIncomingPacket = null;
																		return true;
																	} else if (arg0.currentIncomingPacket == aClass222_2214) {
																		var32 = var3.readString(1202328641);
																		var38 = var3.readUnsignedByte(1121975335) == 1;
																		if (var38) {
																			var6 = var3.readString(-34152931);
																		} else {
																			var6 = var32;
																		}
																		var31 = var3.readUnsignedShort(1750183152);
																		byte var73 = var3.readByte((byte) 13);
																		var39 = false;
																		if (var73 == -128) {
																			var39 = true;
																		}
																		if (var39) {
																			if (Class452.anInt5561 == 0) {
																				arg0.currentIncomingPacket = null;
																				return true;
																			}
																			boolean var59 = false;
																			for (var11 = 0; var11 < Class452.anInt5561; var11++) {
																				if (Class95_Sub22.aClass13Array7210[var11].aString171.equals(var6) && var31 == Class95_Sub22.aClass13Array7210[var11].anInt169) {
																					if (arg1 <= 5) {
																						throw new IllegalStateException();
																					}
																					break;
																				}
																			}
																			if (var11 < Class452.anInt5561) {
																				while (var11 < Class452.anInt5561 - 1) {
																					Class95_Sub22.aClass13Array7210[var11] = Class95_Sub22.aClass13Array7210[var11 + 1];
																					var11++;
																				}
																				Class452.anInt5561--;
																				Class95_Sub22.aClass13Array7210[Class452.anInt5561] = null;
																			}
																		} else {
																			var57 = var3.readString(-1399862228);
																			Class13 var77 = new Class13();
																			var77.aString172 = var32;
																			var77.aString171 = var6;
																			var77.aString170 = Class531.method6297(var77.aString171, -1877688524);
																			var77.anInt169 = var31;
																			var77.aByte173 = var73;
																			var77.aString168 = var57;
																			for (var12 = Class452.anInt5561 - 1; var12 >= 0; var12--) {
																				var53 = Class95_Sub22.aClass13Array7210[var12].aString170.compareTo(var77.aString170);
																				if (var53 == 0) {
																					Class95_Sub22.aClass13Array7210[var12].anInt169 = var31;
																					Class95_Sub22.aClass13Array7210[var12].aByte173 = var73;
																					Class95_Sub22.aClass13Array7210[var12].aString168 = var57;
																					if (var6.equals(Class263_Sub2.myPlayer.aString10221)) {
																						Class513.aByte5966 = var73;
																					}
																					client.anInt9109 = client.anInt9268;
																					arg0.currentIncomingPacket = null;
																					return true;
																				}
																				if (var53 < 0) {
																					if (arg1 <= 5) {
																					}
																					break;
																				}
																			}
																			if (Class452.anInt5561 >= Class95_Sub22.aClass13Array7210.length) {
																				arg0.currentIncomingPacket = null;
																				return true;
																			}
																			for (var53 = Class452.anInt5561 - 1; var53 > var12; var53--) {
																				Class95_Sub22.aClass13Array7210[var53 + 1] = Class95_Sub22.aClass13Array7210[var53];
																			}
																			if (Class452.anInt5561 == 0) {
																				Class95_Sub22.aClass13Array7210 = new Class13[100];
																			}
																			Class95_Sub22.aClass13Array7210[var12 + 1] = var77;
																			Class452.anInt5561++;
																			if (var6.equals(Class263_Sub2.myPlayer.aString10221)) {
																				Class513.aByte5966 = var73;
																			}
																		}
																		client.anInt9109 = client.anInt9268;
																		arg0.currentIncomingPacket = null;
																		return true;
																	} else if (arg0.currentIncomingPacket == GLOBAL_STRING2_PACKET) {
																		var27 = var3.readUnsignedLEShortA(890687899);
																		var28 = var3.readString(975385092);
																		Class263_Sub3.method2630((byte) -53);
																		Class_ra_Sub3.method5217(var27, var28, -1374652876);
																		arg0.currentIncomingPacket = null;
																		return true;
																	} else {
																		String var42;
																		String var47;
																		if (GAME_MESSAGE_PACKET == arg0.currentIncomingPacket) {
																			var27 = var3.readSmart(-643024765);
																			var5 = var3.readInt((byte) 110);
																			var33 = var3.readUnsignedByte(948789157);
																			var40 = "";
																			var47 = var40;
																			if ((var33 & 0x1) != 0) {
																				var40 = var3.readString(931998484);
																				if ((var33 & 0x2) == 0) {
																					var47 = var40;
																				} else {
																					var47 = var3.readString(-1266183473);
																				}
																			}
																			var42 = var3.readString(-467763289);
																			if (var27 == 99) {
																				Class56.panelBoxMessage(var42, -1971837846);
																			} else if (var27 == 98) {
																				Class154.method1821(var42, 974586738);
																			} else if (var47.equals("") || !Class65.foundPlayer(var47, -473410086)) {
																				Class556.method6406(var27, var5, var40, var47, var40, var42, -1981632762);
																				var57 = var42.replaceAll("<.+?>", "");
																				System.out.println(var57);
																			} else {
																				arg0.currentIncomingPacket = null;
																				return true;
																			}
																			arg0.currentIncomingPacket = null;
																			return true;
																		} else if (aClass222_2319 == arg0.currentIncomingPacket) {
																			Class204.method2182(Class213.aClass213_2068, 962524669);
																			arg0.currentIncomingPacket = null;
																			return true;
																		} else if (SKILL_STAT_PACKET == arg0.currentIncomingPacket) {
																			var27 = var3.readUnsignedByteS(-400233324);
																			var5 = var3.readUnsignedByteA(-741334169);
																			var33 = var3.readLEInt(1909900765);
																			client.anIntArray9144[var27] = var33;
																			client.anIntArray9117[var27] = var5;
																			client.anIntArray9143[var27] = 1;
																			var31 = Class429.anIntArray4366[var27] - 1;
																			for (var35 = 0; var35 < var31; var35++) {
																				if (var33 >= Class429.anIntArray4365[var35]) {
																					client.anIntArray9143[var27] = var35 + 2;
																				}
																			}
																			client.anIntArray9189[++client.anInt9247 - 1 & 0x1F] = var27;
																			arg0.currentIncomingPacket = null;
																			return true;
																		} else if (CAMERA_ROTATION_PACKET == arg0.currentIncomingPacket) {
																			var27 = var3.readUnsignedShort(1638886828);
																			var5 = var3.readUnsignedShort(1066169125);
																			Class263_Sub3.method2630((byte) -3);
																			Class157.method1834(var27, var5, 0, (byte) 68);
																			arg0.currentIncomingPacket = null;
																			return true;
																		} else if (arg0.currentIncomingPacket == aClass222_2229) {
																			var27 = var3.readInt((byte) 125);
																			Class263_Sub3.method2630((byte) -61);
																			if (var27 == -1) {
																				Class457.anInt6844 = -1;
																				Class439.anInt4456 = -1;
																			} else {
																				Class381 var94 = client.aClass304_9030.method3022(179397726);
																				var33 = var27 >> 14 & 0x3FFF;
																				var31 = var27 & 0x3FFF;
																				var33 -= var94.gameSceneBaseX;
																				if (var33 < 0) {
																					var33 = 0;
																				} else if (var33 >= client.aClass304_9030.method2990(-1505560219)) {
																					var33 = client.aClass304_9030.method2990(-2034925469);
																				}
																				var31 -= var94.gameSceneBaseY;
																				if (var31 < 0) {
																					var31 = 0;
																				} else if (var31 >= client.aClass304_9030.method3033((byte) -63)) {
																					var31 = client.aClass304_9030.method3033((byte) -108);
																				}
																				Class457.anInt6844 = (var33 << 9) + 256;
																				Class439.anInt4456 = (var31 << 9) + 256;
																			}
																			arg0.currentIncomingPacket = null;
																			return true;
																		} else if (aClass222_2315 == arg0.currentIncomingPacket) {
																			var27 = var3.readUnsignedLEShort(15163594);
																			var5 = var3.readUnsignedByteC(-243015761);
																			Class263_Sub3.method2630((byte) -34);
																			Class415.method5246(var27, var5, true, -1549035603);
																			arg0.currentIncomingPacket = null;
																			return true;
																		} else if (aClass222_2203 == arg0.currentIncomingPacket) {
																			var27 = var3.readInt((byte) 36);
																			var5 = var3.method3801((byte) 0);
																			var33 = var3.method3797((short) -4291);
																			Class263_Sub3.method2630((byte) -8);
																			Class305.method3050(var27, var5, var33, (byte) 123);
																			arg0.currentIncomingPacket = null;
																			return true;
																		} else {
																			Class330_Sub35 var60;
																			boolean var76;
																			if (arg0.currentIncomingPacket == GRAPHICS_PACKET) {
																				var27 = var3.readUnsignedByteS(-400233324);
																				var5 = var3.readUnsignedByteA(-741334169);
																				var33 = var3.readUnsignedShortA((byte) -88);
																				var31 = var3.readUnsignedShort(745084552);
																				var35 = var3.readInt((byte) 110);
																				var37 = var3.readUnsignedShort(2028049331);
																				if (var37 == 65535) {
																					var37 = -1;
																				}
																				var10 = var5 & 0x7;
																				var11 = var5 >> 3 & 0xF;
																				if (var11 == 15) {
																					var11 = -1;
																				}
																				boolean var71 = (var5 >> 7 & 0x1) == 1;
																				int var19;
																				if (var35 >> 30 == 0) {
																					Class440 var21;
																					Class437 var92;
																					Class440 var96;
																					if (var35 >> 29 != 0) {
																						var53 = var35 & 0xFFFF;
																						var60 = (Class330_Sub35) client.aClass497_9014.method6094((long) var53);
																						if (var60 != null) {
																							NPC var74 = (NPC) var60.anObject7733;
																							Gfx var93 = var74.graphics[var27];
																							if (var37 == 65535) {
																								var37 = -1;
																							}
																							var88 = true;
																							var18 = var93.id;
																							if (var37 != -1 && var18 != -1) {
																								if (var37 == var18) {
																									var92 = Class136.aClass416_1527.method5254(var37, -987037057);
																									if (var92.aBoolean4443 && var92.anInt4431 != -1) {
																										var96 = Class201.aClass436_6511.method5570(var92.anInt4431, -1403698335);
																										int var104 = var96.anInt4472;
																										if (var104 == 0 || var104 == 2) {
																											var88 = false;
																										} else if (var104 == 1) {
																											var88 = true;
																										}
																									}
																								} else {
																									var92 = Class136.aClass416_1527.method5254(var37, -348164064);
																									Class437 var95 = Class136.aClass416_1527.method5254(var18, -687784550);
																									if (var92.anInt4431 != -1 && var95.anInt4431 != -1) {
																										var21 = Class201.aClass436_6511.method5570(var92.anInt4431, 1212545554);
																										Class440 var22 = Class201.aClass436_6511.method5570(var95.anInt4431, -500759808);
																										if (var21.anInt4470 < var22.anInt4470) {
																											var88 = false;
																										}
																									}
																								}
																							}
																							if (var88) {
																								var93.id = var37;
																								var93.height = var33;
																								var93.anInt572 = var11;
																								if (var37 == -1) {
																									var93.aClass477_573.method5988(-1, (byte) -46);
																								} else {
																									var92 = Class136.aClass416_1527.method5254(var37, -1540491307);
																									var102 = var92.aBoolean4443 ? 0 : 2;
																									if (var71) {
																										var102 = 1;
																									}
																									var93.aClass477_573.method5970(var92.anInt4431, var31, var102, false, -2030493597);
																								}
																							}
																						}
																					} else if (var35 >> 28 != 0) {
																						var53 = var35 & 0xFFFF;
																						Player var64;
																						if (var53 == client.anInt9121) {
																							var64 = Class263_Sub2.myPlayer;
																						} else {
																							var64 = client.players[var53];
																						}
																						if (var64 != null) {
																							Gfx var78 = var64.graphics[var27];
																							if (var37 == 65535) {
																								var37 = -1;
																							}
																							var76 = true;
																							var17 = var78.id;
																							Class437 var84;
																							if (var37 != -1 && var17 != -1) {
																								if (var37 == var17) {
																									var84 = Class136.aClass416_1527.method5254(var37, -830528614);
																									if (var84.aBoolean4443 && var84.anInt4431 != -1) {
																										Class440 var103 = Class201.aClass436_6511.method5570(var84.anInt4431, -1885475118);
																										var102 = var103.anInt4472;
																										if (var102 == 0 || var102 == 2) {
																											var76 = false;
																										} else if (var102 == 1) {
																											var76 = true;
																										}
																									}
																								} else {
																									var84 = Class136.aClass416_1527.method5254(var37, -1297358829);
																									var92 = Class136.aClass416_1527.method5254(var17, -1738714106);
																									if (var84.anInt4431 != -1 && var92.anInt4431 != -1) {
																										var96 = Class201.aClass436_6511.method5570(var84.anInt4431, 1195995432);
																										var21 = Class201.aClass436_6511.method5570(var92.anInt4431, -717538406);
																										if (var96.anInt4470 < var21.anInt4470) {
																											var76 = false;
																										}
																									}
																								}
																							}
																							if (var76) {
																								var78.id = var37;
																								var78.height = var33;
																								var78.anInt572 = var11;
																								var78.anInt575 = var10;
																								if (var37 == -1) {
																									var78.aClass477_573.method5988(-1, (byte) -6);
																								} else {
																									var84 = Class136.aClass416_1527.method5254(var37, 1025764732);
																									var19 = var84.aBoolean4443 ? 0 : 2;
																									if (var71) {
																										var19 = 1;
																									}
																									var78.aClass477_573.method5970(var84.anInt4431, var31, var19, false, -1967272801);
																								}
																							}
																						}
																					}
																				} else {
																					var66 = client.aClass304_9030.method3022(2131803749);
																					var61 = var35 >> 28 & 0x3;
																					var70 = (var35 >> 14 & 0x3FFF) - var66.gameSceneBaseX;
																					var16 = (var35 & 0x3FFF) - var66.gameSceneBaseY;
																					if (var70 >= 0 && var16 >= 0 && var70 < client.aClass304_9030.method2990(-1555329862) && var16 < client.aClass304_9030.method3033((byte) -49)) {
																						if (var37 == -1) {
																							Class330_Sub36_Sub2 var82 = (Class330_Sub36_Sub2) client.aClass497_9216.method6094((long) (var70 << 16 | var16));
																							if (var82 != null) {
																								var82.aClass432_Sub1_Sub1_Sub4_9624.method5503(888749273);
																								var82.method3252(-538178536);
																							}
																						} else {
																							var17 = var70 * 512 + 256;
																							var18 = var16 * 512 + 256;
																							var19 = var61;
																							if (var61 < 3 && client.aClass304_9030.method2995(1184381119).method2788(var70, var16, (byte) -40)) {
																								var19 = var61 + 1;
																							}
																							Class432_Sub1_Sub1_Sub4 var20 = new Class432_Sub1_Sub1_Sub4(client.aClass304_9030.method3023(-400722441), var37, var31, var61, var19, var17, Class431.method5342(var17, var18, var61, 1996761881) - var33, var18, var70, var70, var16, var16, var10, var71, 0);
																							client.aClass497_9216.method6097(new Class330_Sub36_Sub2(var20), (long) (var70 << 16 | var16));
																						}
																					}
																				}
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (arg0.currentIncomingPacket == CLOSE_INTERFACE_PACKET) {
																				var27 = var3.readInt2(-793658723);
																				Class263_Sub3.method2630((byte) -32);
																				Class330_Sub48 var87 = (Class330_Sub48) client.aClass497_9284.method6094((long) var27);
																				if (var87 != null) {
																					Class75.method854(var87, true, false, -1235540325);
																				}
																				if (client.aClass114_9078 != null) {
																					Class404.method4738(client.aClass114_9078, 1862969853);
																					client.aClass114_9078 = null;
																				}
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (SYSTEM_UPDATE_PACKET == arg0.currentIncomingPacket) {
																				if (Class226.method2307(client.anInt8995, (byte) 49)) {
																					client.anInt9026 = (int) ((float) var3.readUnsignedShort(1803791689) * 2.5F);
																				} else {
																					client.anInt9026 = var3.readUnsignedShort(-68807800) * 30;
																				}
																				client.anInt9208 = client.anInt9268;
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (arg0.currentIncomingPacket == SPAWN_OBJECT_PACKET) {
																				Class204.method2182(Class213.aClass213_2069, -1499871138);
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (RESET_CAMERA_PACKET == arg0.currentIncomingPacket) {
																				Class263_Sub3.method2630((byte) -18);
																				Class340.method3971(1518850702);
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (aClass222_2235 == arg0.currentIncomingPacket) {
																				if (client.windowPaneId != -1) {
																					Class527.method6268(client.windowPaneId, 0, (byte) 54);
																				}
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (MINIMAP_FLAG_PACKET == arg0.currentIncomingPacket) {
																				var27 = var3.readUnsignedByteA(-741334169);
																				var5 = var3.readUnsignedByteC(-243015761);
																				if (var5 == 255) {
																					var5 = -1;
																					var27 = -1;
																				}
																				Class487.method6037(var5, var27, 1573515222);
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (CAMERA_LOOK_PACKET == arg0.currentIncomingPacket) {
																				var27 = var3.readUnsignedShortA((byte) -96) << 2;
																				var5 = var3.readUnsignedByte(795090636);
																				var33 = var3.readUnsignedByteS(-400233324);
																				var31 = var3.readUnsignedByteC(-243015761);
																				var35 = var3.readUnsignedByteS(-400233324);
																				Class263_Sub3.method2630((byte) -111);
																				Class102.method1223(var35, var5, var27, var33, var31, -1397321747);
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (ICOMPONENT_TEXT_PACKET == arg0.currentIncomingPacket) {
																				var32 = var3.readString(1884188541);
																				var5 = var3.readInt((byte) 33);
																				Class263_Sub3.method2630((byte) -127);
																				Class443.method5615(var5, var32, 1079947428);
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (LOGOUT_PACKET == arg0.currentIncomingPacket) {
																				Class330_Sub31.logout(false, 828998931);
																				arg0.currentIncomingPacket = null;
																				return false;
																			} else if (aClass222_2309 == arg0.currentIncomingPacket) {
																				var27 = var3.readUnsignedShort(392467685);
																				Class263_Sub3.method2630((byte) 0);
																				Class502.method6132(var27, (byte) -126);
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (aClass222_2298 == arg0.currentIncomingPacket) {
																				client.aBoolean9130 = var3.readUnsignedByte(1842939030) == 1;
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (UNLOCK_IGNORES_LIST_PACKET == arg0.currentIncomingPacket) {
																				client.anInt9257 = 1;
																				client.anInt9023 = client.anInt9268;
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (aClass222_2228 == arg0.currentIncomingPacket) {
																				Class204.method2182(Class213.aClass213_2077, 1310020029);
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (PROJECTILE_PACKET == arg0.currentIncomingPacket) {
																				Class204.method2182(Class213.aClass213_2065, -1574534106);
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (arg0.currentIncomingPacket == aClass222_2280) {
																				client.anInt9181 = client.anInt9268;
																				var26 = var3.readUnsignedByte(1155609136) == 1;
																				Class167 var75 = new Class167(var3);
																				Class330_Sub39 var91;
																				if (var26) {
																					var91 = Class106.aClass330_Sub39_1009;
																				} else {
																					var91 = Class_ra_Sub3.aClass330_Sub39_8652;
																				}
																				var75.method2018(var91, -1998750649);
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (aClass222_2349 == arg0.currentIncomingPacket) {
																				Class153.anInt1634 = var3.readByteC(-1966501238) << 3;
																				Class1.anInt39 = var3.readUnsignedByteC(-243015761);
																				IsaacCipher.anInt5837 = var3.readByteS((byte) 98) << 3;
																				while (var3.offset < arg0.anInt26) {
																					Class213 var101 = Class70.method820((byte) 16)[var3.readUnsignedByte(1454028747)];
																					Class204.method2182(var101, 624159477);
																				}
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (arg0.currentIncomingPacket == aClass222_2264) {
																				var27 = var3.readUnsignedShort(23637310);
																				var5 = var3.readUnsignedByteS(-400233324);
																				int[] var89 = new int[Class487_Sub1.method6040(757986984).length];
																				for (var31 = 0; var31 < Class487_Sub1.method6040(654045840).length; var31++) {
																					var89[var31] = var3.readInt1((byte) 2);
																				}
																				Class330_Sub35 var49 = (Class330_Sub35) client.aClass497_9014.method6094((long) var27);
																				if (var49 != null) {
																					Class150_Sub2.method1772((Class432_Sub1_Sub1_Sub1) var49.anObject7733, var89, var5, true, (byte) -25);
																				}
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (arg0.currentIncomingPacket == ANIMATE_INTERFACE_PACKET) {
																				var27 = var3.readInt((byte) 95);
																				var5 = var3.readInt2(-793658723);
																				Class263_Sub3.method2630((byte) -110);
																				Class157.method1835(var27, var5, -1269295745);
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (arg0.currentIncomingPacket == aClass222_2221) {
																				var27 = var3.readLEInt(-75833772);
																				var5 = var3.readUnsignedLEShortA(1555968511);
																				Class263_Sub3.method2630((byte) -98);
																				Class95.method1105(var27, var5, (byte) 126);
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (arg0.currentIncomingPacket == aClass222_2198) {
																				client.anInt9158 = var3.readShort(-1100583751);
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (SEND_PRIVATE_MESSAGE_PACKET == arg0.currentIncomingPacket) {
																				var32 = var3.readString(-484242470);
																				var28 = Class117.method1426(Class113.method1386(var3, 1211547434), 1201716859);
																				Class556.method6406(6, 0, var32, var32, var32, var28, -1960907748);
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (arg0.currentIncomingPacket == aClass222_2239) {
																				var27 = var3.readUnsignedByteC(-243015761);
																				var34 = var3.readByteC(-2145772726);
																				Class263_Sub3.method2630((byte) -97);
																				Class464_Sub10.method5775(var34, var27, -643686455);
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (ACCESS_MASK_PACKET == arg0.currentIncomingPacket) {
																				var27 = var3.readUnsignedShort(1251569904);
																				if (var27 == 65535) {
																					var27 = -1;
																				}
																				var5 = var3.readLEInt(-1949204286);
																				var33 = var3.readInt2(-793658723);
																				var31 = var3.readUnsignedLEShort(15163594);
																				if (var31 == 65535) {
																					var31 = -1;
																				}
																				Class263_Sub3.method2630((byte) -13);
																				for (var35 = var27; var35 <= var31; var35++) {
																					var9 = ((long) var33 << 32) + (long) var35;
																					var62 = (Class330_Sub2) client.aClass497_9211.method6094(var9);
																					if (var62 != null) {
																						var65 = new Class330_Sub2(var5, var62.anInt7502);
																						var62.method3252(751041187);
																					} else if (var35 == -1) {
																						var65 = new Class330_Sub2(var5, Class95.method1101(var33, 767255701).aClass330_Sub2_1273.anInt7502);
																					} else {
																						var65 = new Class330_Sub2(var5, -1);
																					}
																					client.aClass497_9211.method6097(var65, var9);
																				}
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (arg0.currentIncomingPacket == DESTROY_OBJECT_PACKET) {
																				Class204.method2182(Class213.aClass213_2064, -1757997412);
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (arg0.currentIncomingPacket == SEND_URL_PACKET) {
																				if (Class503.aBoolean5914 && Class130.aFrame1498 != null) {
																					Class96.method1182(Class448.aClass330_Sub50_5555.aClass464_Sub8_7897.method5763(2127349097), -1, -1, false, 1938001314);
																				}
																				var30 = new byte[arg0.anInt26 - 1];
																				var38 = var3.readUnsignedByte(1843525994) == 1;
																				var3.method3828(var30, 0, arg0.anInt26 - 1, 1689124730);
																				var85 = new Buffer(var30);
																				var40 = var85.readString(-1048963236);
																				if (var38) {
																					var47 = var85.readString(1137254293);
																					if (var47.length() == 0) {
																						var47 = var40;
																					}
																					if (!client.aBoolean9198 || Class212.aString6533.startsWith("mac") || !Class239.method2379(var40, 1, Class232.aClass232_2450.method2354((byte) -80), (byte) 0)) {
																						Class532.openLink(var47, true, Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-971274358) == 5, client.aBoolean9042, client.aBoolean8966, 724806507);
																					}
																				} else {
																					Class532.openLink(var40, true, Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-729786679) == 5, client.aBoolean9042, client.aBoolean8966, 2124849645);
																				}
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (arg0.currentIncomingPacket == GLOBAL_CONFIG2_PACKET) {
																				var27 = var3.readUnsignedLEShortA(-1749423903);
																				var5 = var3.readLEInt(-58148179);
																				Class263_Sub3.method2630((byte) -14);
																				Class200.sendGlobalConfig(var27, var5, (byte) 83);
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (aClass222_2336 == arg0.currentIncomingPacket) {
																				Class401_Sub1.aClass145_Sub1_8249.method1727(var3, arg0.anInt26, -1709230766);
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (arg0.currentIncomingPacket == RECEIVE_FRIENDS_CHAT_MESSAGE_PACKET) {
																				Class332.anObjectArray6640 = null;
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (arg0.currentIncomingPacket == RUNSCRIPT_PACKET) {
																				var32 = var3.readString(1655520377);
																				Object[] var58 = new Object[var32.length() + 1];
																				for (var33 = var32.length() - 1; var33 >= 0; var33--) {
																					if (var32.charAt(var33) == 's') {
																						var58[var33 + 1] = var3.readString(1093254579);
																					} else {
																						var58[var33 + 1] = Integer.valueOf(var3.readInt((byte) 49));
																					}
																				}
																				var58[0] = Integer.valueOf(var3.readInt((byte) 65));
																				Class263_Sub3.method2630((byte) -114);
																				Class330_Sub42 var83 = new Class330_Sub42();
																				var83.anObjectArray7817 = var58;
																				Class117.method1423(var83, -1631194987);
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (aClass222_2306 == arg0.currentIncomingPacket) {
																				Class204.method2182(Class213.aClass213_2070, 1882674060);
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else if (arg0.currentIncomingPacket == aClass222_2219) {
																				var26 = var3.readUnsignedByte(1841895275) == 1;
																				if (var26) {
																					Class147.anInt1621 = 2;
																				} else {
																					Class340.method3971(-593752096);
																				}
																				arg0.currentIncomingPacket = null;
																				return true;
																			} else {
																				boolean var36;
																				if (PUBLIC_CHAT_PACKET == arg0.currentIncomingPacket) {
																					var27 = var3.readUnsignedShort(1299175654);
																					Player var50;
																					if (var27 == client.anInt9121) {
																						var50 = Class263_Sub2.myPlayer;
																					} else {
																						var50 = client.players[var27];
																					}
																					if (var50 == null) {
																						arg0.currentIncomingPacket = null;
																						return true;
																					}
																					var33 = var3.readUnsignedShort(1873996381);
																					var31 = var3.readUnsignedByte(1636004997);
																					var36 = (var33 & 0x8000) != 0;
																					if (var50.aString10221 != null && var50.aClass408_10240 != null) {
																						var39 = false;
																						if (var31 <= 1) {
																							if (!var36 && (client.aBoolean9083 && !client.aBoolean9228 || client.aBoolean9073)) {
																								var39 = true;
																							} else if (Class65.foundPlayer(var50.aString10221, -305178755)) {
																								var39 = true;
																							}
																						}
																						if (!var39) {
																							var10 = -1;
																							String var55;
																							if (var36) {
																								var33 &= 0x7FFF;
																								Class209 var51 = Class540.method6328(var3, -1657511033);
																								var10 = var51.anInt1981;
																								var55 = var51.aClass330_Sub36_Sub4_1982.method3457(var3, 854331544);
																							} else {
																								var55 = Class117.method1426(Class113.method1386(var3, 1364608687), 1201716859);
																							}
																							var50.method5466(var55.trim(), var33 >> 8, var33 & 0xFF, -1947216170);
																							if (var31 == 1 || var31 == 2) {
																								var12 = var36 ? 17 : 1;
																							} else {
																								var12 = var36 ? 17 : 2;
																							}
																							if (var31 == 2) {
																								Class81.sendSpeech(var12, 0, Class325_Sub4.method3225(1, -597373685) + var50.method5471(true, 1310534929), Class325_Sub4.method3225(1, -1423176618) + var50.method5460(false, 1255321384), var50.displayName, var55, null, var10, (byte) 25);
																							} else if (var31 == 1) {
																								Class81.sendSpeech(var12, 0, Class325_Sub4.method3225(0, -487501015) + var50.method5471(true, 1014786357), Class325_Sub4.method3225(0, -851149307) + var50.method5460(false, 1768626005), var50.displayName, var55, null, var10, (byte) 98);
																							} else if (var31 == 0) {
																								Class81.sendSpeech(var12, 0, var50.method5471(true, 1429690474), var50.method5460(false, -12839585), var50.displayName, var55, null, var10, (byte) 99);
																							} else {
																								Class81.sendSpeech(var12, 0, "<img=" + var31 + ">" + var50.method5471(true, 1429690474), "<img=" + var31 + ">" + var50.method5460(false, -12839585), var50.displayName, var55, null, var10, (byte) 99);
																							}
																						}
																					}
																					arg0.currentIncomingPacket = null;
																					return true;
																				}
																				String var72;
																				if (arg0.currentIncomingPacket == RECEIVE_CLAN_CHAT_MESSAGE) {
																					var26 = var3.readUnsignedByte(937580412) == 1;
																					var28 = var3.readString(289976021);
																					var68 = var3.readUnsignedShort(-123862598);
																					var44 = var3.readUnsignedTriByte(-1401356047);
																					var10 = var3.readUnsignedByte(1266062639);
																					var52 = var44 + (var68 << 32);
																					boolean var54 = false;
																					var60 = null;
																					var69 = var26 ? Class106.aClass330_Sub39_1009 : Class_ra_Sub3.aClass330_Sub39_8652;
																					if (var69 == null) {
																						var54 = true;
																					} else {
																						var16 = 0;
																						while (true) {
																							if (var16 >= 100) {
																								if (var10 <= 1) {
																									if (client.aBoolean9083 && !client.aBoolean9228 || client.aBoolean9073) {
																										var54 = true;
																									} else if (Class65.foundPlayer(var28, 444189205)) {
																										var54 = true;
																									}
																								}
																								break;
																							}
																							if (client.aLongArray9064[var16] == var52) {
																								var54 = true;
																								break;
																							}
																							var16++;
																						}
																					}
																					if (!var54) {
																						client.aLongArray9064[client.anInt9190] = var52;
																						client.anInt9190 = (client.anInt9190 + 1) % 100;
																						var72 = Class117.method1426(Class113.method1386(var3, 844497971), 1201716859);
																						var17 = var26 ? 41 : 44;
																						if (var10 == 2 || var10 == 3) {
																							Class81.sendSpeech(var17, 0, Class325_Sub4.method3225(1, -628307992) + var28, Class325_Sub4.method3225(1, 71699746) + var28, var28, var72, var69.aString7757, -1, (byte) 88);
																						} else if (var10 == 1) {
																							Class81.sendSpeech(var17, 0, Class325_Sub4.method3225(0, -160595588) + var28, Class325_Sub4.method3225(0, 359005140) + var28, var28, var72, var69.aString7757, -1, (byte) 40);
																						} else {
																							Class81.sendSpeech(var17, 0, var28, var28, var28, var72, var69.aString7757, -1, (byte) 108);
																						}
																					}
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (arg0.currentIncomingPacket == aClass222_2247) {
																					Class332.anObjectArray6640 = new Object[Class95_Sub7.aClass536_7157.anInt6230];
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (aClass222_2345 == arg0.currentIncomingPacket) {
																					client.aByte9283 = var3.readByteS((byte) -21);
																					if (client.aByte9283 == 0 || client.aByte9283 == 1) {
																						client.aBoolean9120 = true;
																					}
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (arg0.currentIncomingPacket == IGNORES_PACKET) {
																					while (var3.offset < arg0.anInt26) {
																						var27 = var3.readUnsignedByte(259209473);
																						var38 = (var27 & 0x1) == 1;
																						var6 = var3.readString(1519053343);
																						var40 = var3.readString(1985096744);
																						for (var35 = 0; var35 < client.anInt9261; var35++) {
																							Class75 var45 = client.aClass75Array8982[var35];
																							if (var38) {
																								if (var40.equals(var45.aString646)) {
																									var45.aString646 = var6;
																									var45.aString647 = var40;
																									var6 = null;
																									break;
																								}
																							} else if (var6.equals(var45.aString646)) {
																								var45.aString646 = var6;
																								var45.aString647 = var40;
																								var6 = null;
																								break;
																							}
																						}
																						if (var6 != null && client.anInt9261 < 100) {
																							Class75 var43 = new Class75();
																							client.aClass75Array8982[client.anInt9261] = var43;
																							var43.aString646 = var6;
																							var43.aString647 = var40;
																							var43.aBoolean648 = (var27 & 0x2) == 2;
																							client.anInt9261++;
																						}
																					}
																					client.anInt9023 = client.anInt9268;
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (arg0.currentIncomingPacket == GLOBAL_CONFIG1_PACKET) {
																					var27 = var3.readUnsignedShortA((byte) -117);
																					var34 = var3.readByteS((byte) -86);
																					Class263_Sub3.method2630((byte) -39);
																					Class200.sendGlobalConfig(var27, var34, (byte) 37);
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (aClass222_2200 == arg0.currentIncomingPacket) {
																					for (var27 = 0; var27 < client.players.length; var27++) {
																						if (client.players[var27] != null) {
																							client.players[var27].anIntArray10030 = null;
																							client.players[var27].aClass477_10032.method5988(-1, (byte) 90);
																						}
																					}
																					for (var27 = 0; var27 < client.anInt9232; var27++) {
																						((Class432_Sub1_Sub1_Sub1) client.aClass330_Sub35Array9015[var27].anObject7733).anIntArray10030 = null;
																						((Class432_Sub1_Sub1_Sub1) client.aClass330_Sub35Array9015[var27].anObject7733).aClass477_10032.method5988(-1, (byte) -89);
																					}
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (aClass222_2289 == arg0.currentIncomingPacket) {
																					Class284.anInt2928 = var3.readTriByte(-616992913);
																					client.aBoolean9083 = var3.readUnsignedByte(749513996) == 1;
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (arg0.currentIncomingPacket == aClass222_2236) {
																					var27 = var3.readUnsignedByteA(-741334169);
																					var5 = var3.readUnsignedShort(1174113920);
																					var63 = (var27 & 0x1) == 1;
																					Class95_Sub15.method1157(var5, var63, 1110304166);
																					client.anIntArray9187[++client.anInt9188 - 1 & 0x1F] = var5;
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (DYNAMIC_MAP_REGION_PACKET == arg0.currentIncomingPacket) {
																					var56 = new Class330_Sub46_Sub2(arg0.anInt26);
																					System.arraycopy(arg0.aClass330_Sub46_Sub2_17.payload, arg0.aClass330_Sub46_Sub2_17.offset, var56.payload, 0, arg0.anInt26);
																					Class490.method6070(424511141);
																					if (Class448.aClass330_Sub50_5555.aClass464_Sub24_7904.method5825((byte) -17) == 1) {
																						Class43.aClass276_10073.method2725(new Class300(OutgoingPacketManager.aClass310_3209, var56), (byte) 32);
																					} else {
																						client.aClass304_9030.method3026(new Class300(OutgoingPacketManager.aClass310_3209, var56), 1971978149);
																					}
																					arg0.currentIncomingPacket = null;
																					return false;
																				} else if (aClass222_2268 == arg0.currentIncomingPacket) {
																					var27 = var3.readInt1((byte) 2);
																					if (Class243.anInt6988 != var27) {
																						Class243.anInt6988 = var27;
																						Class230.method2339(Class545.aClass545_7011, -1, -1, -1901949920);
																					}
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (SEND_FRIENDS_CHAT_MESSAGE_PACKET == arg0.currentIncomingPacket) {
																					var26 = var3.readUnsignedByte(-48607419) == 1;
																					var28 = var3.readString(823991415);
																					var6 = var28;
																					if (var26) {
																						var6 = var3.readString(809788616);
																					}
																					var7 = var3.readLong(-576592454);
																					var9 = var3.readUnsignedShort(1513973837);
																					var52 = var3.readUnsignedTriByte(-1401356047);
																					var53 = var3.readUnsignedByte(1817442976);
																					long var14 = (var9 << 32) + var52;
																					var76 = false;
																					var17 = 0;
																					while (true) {
																						if (var17 >= 100) {
																							if (var53 <= 1) {
																								if (client.aBoolean9083 && !client.aBoolean9228 || client.aBoolean9073) {
																									var76 = true;
																								} else if (Class65.foundPlayer(var6, -1163243353)) {
																									var76 = true;
																								}
																							}
																							break;
																						}
																						if (client.aLongArray9064[var17] == var14) {
																							var76 = true;
																							break;
																						}
																						var17++;
																					}
																					if (!var76) {
																						client.aLongArray9064[client.anInt9190] = var14;
																						client.anInt9190 = (client.anInt9190 + 1) % 100;
																						var79 = Class117.method1426(Class113.method1386(var3, 1791936037), 1201716859);
																						if (var53 == 2 || var53 == 3) {
																							Class81.sendSpeech(9, 0, Class325_Sub4.method3225(1, 943658578) + var28, Class325_Sub4.method3225(1, 55789380) + var6, var28, var79, Class211.method2222(var7), -1, (byte) 81);
																						} else if (var53 == 1) {
																							Class81.sendSpeech(9, 0, Class325_Sub4.method3225(0, 1070138339) + var28, Class325_Sub4.method3225(0, -1978322191) + var6, var28, var79, Class211.method2222(var7), -1, (byte) 88);
																						} else if (var53 == 0) {
																							Class81.sendSpeech(9, 0, var28, var6, var28, var79, Class211.method2222(var7), -1, (byte) 37);
																						}
																					}
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (arg0.currentIncomingPacket == aClass222_2297) {
																					var27 = var3.readUnsignedShort(301980835);
																					var5 = var3.readInt((byte) 66);
																					var33 = var3.readInt((byte) 37);
																					var31 = var3.readUnsignedLEShort(15163594);
																					var35 = var3.readInt1((byte) 2);
																					var37 = var3.readUnsignedByteA(-741334169);
																					var10 = var3.readInt2(-793658723);
																					var11 = var3.readInt((byte) 9);
																					Class381 var48 = new Class381(var3.readInt1((byte) 2));
																					Class263_Sub3.method2630((byte) -114);
																					Class423.method5302(var10, new Class330_Sub48_Sub1(var31, var37, new Class410(var48, var27)), new int[] { var35, var33, var11, var5 }, false, (short) 16385);
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (aClass222_2279 == arg0.currentIncomingPacket) {
																					var27 = var3.readUnsignedShortA((byte) -36);
																					if (var27 == 65535) {
																						var27 = -1;
																					}
																					Class386.method4432(var27, (byte) -89);
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (aClass222_2233 == arg0.currentIncomingPacket) {
																					Class204.method2182(Class213.aClass213_2076, 1836335497);
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (arg0.currentIncomingPacket == NPC_ON_INTERFACE_PACKET) {
																					var27 = var3.readLEInt(552539919);
																					var5 = var3.readInt((byte) 119);
																					Class263_Sub3.method2630((byte) -29);
																					Class134.method1577(var5, 2, var27, -1, 2036251640);
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (aClass222_2211 == arg0.currentIncomingPacket) {
																					Class556.method6410(var3, arg0.anInt26, (byte) -61);
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (arg0.currentIncomingPacket == aClass222_2282) {
																					var27 = var3.readUnsignedShort(-390184880);
																					var5 = var3.readInt((byte) 15);
																					if (Class332.anObjectArray6640 == null) {
																						Class332.anObjectArray6640 = new Object[Class95_Sub7.aClass536_7157.anInt6230];
																					}
																					Class332.anObjectArray6640[var27] = Integer.valueOf(var5);
																					client.anIntArray9195[++client.anInt9196 - 1 & 0x1F] = var27;
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (SOUND_INDEX15_PACKET == arg0.currentIncomingPacket) {
																					var27 = var3.readUnsignedShort(-414372455);
																					if (var27 == 65535) {
																						var27 = -1;
																					}
																					var5 = var3.readUnsignedByte(966490640);
																					var33 = var3.readUnsignedShort(2114960894);
																					var31 = var3.readUnsignedByte(1905105031);
																					Class197.method2147(var27, var5, var33, var31, true, 256, -1387880432);
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (arg0.currentIncomingPacket == aClass222_2212) {
																					var27 = var3.readInt((byte) 99);
																					var38 = var3.readUnsignedByteC(-243015761) == 1;
																					Class263_Sub3.method2630((byte) -96);
																					Class330_Sub39.method3549(var27, var38, 440022729);
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (ICOMPONENT_MODEL_PACKET == arg0.currentIncomingPacket) {
																					var27 = var3.readInt2(-793658723);
																					var5 = var3.readLEInt(-1307375289);
																					Class263_Sub3.method2630((byte) -119);
																					Class501.method6127(var5, var27, 405227913);
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (arg0.currentIncomingPacket == GLOBAL_STRING1_PACKET) {
																					var27 = var3.readUnsignedLEShort(15163594);
																					var28 = var3.readString(-282862135);
																					Class263_Sub3.method2630((byte) -26);
																					Class_ra_Sub3.method5217(var27, var28, -1246980806);
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (aClass222_2267 == arg0.currentIncomingPacket) {
																					var26 = var3.readUnsignedByte(1470080781) == 1;
																					var28 = var3.readString(1608409669);
																					var6 = var28;
																					if (var26) {
																						var6 = var3.readString(-235036424);
																					}
																					var31 = var3.readUnsignedByte(499236154);
																					var36 = false;
																					if (var31 <= 1) {
																						if (client.aBoolean9083 && !client.aBoolean9228 || client.aBoolean9073) {
																							var36 = true;
																						} else if (var31 <= 1 && Class65.foundPlayer(var6, -60452439)) {
																							var36 = true;
																						}
																					}
																					if (!var36) {
																						var42 = Class117.method1426(Class113.method1386(var3, 1376413205), 1201716859);
																						if (var31 == 2) {
																							Class81.sendSpeech(24, 0, Class325_Sub4.method3225(1, 1218900616) + var28, Class325_Sub4.method3225(1, 272972033) + var6, var28, var42, null, -1, (byte) 64);
																						} else if (var31 == 1) {
																							Class81.sendSpeech(24, 0, Class325_Sub4.method3225(0, -1133550009) + var28, Class325_Sub4.method3225(0, -1445613684) + var6, var28, var42, null, -1, (byte) 67);
																						} else {
																							Class81.sendSpeech(24, 0, var28, var6, var28, var42, null, -1, (byte) 92);
																						}
																					}
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (arg0.currentIncomingPacket == aClass222_2317) {
																					var27 = var3.readUnsignedShort(474099602);
																					var34 = var3.readByte((byte) 16);
																					if (Class332.anObjectArray6640 == null) {
																						Class332.anObjectArray6640 = new Object[Class95_Sub7.aClass536_7157.anInt6230];
																					}
																					Class332.anObjectArray6640[var27] = Integer.valueOf(var34);
																					client.anIntArray9195[++client.anInt9196 - 1 & 0x1F] = var27;
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (aClass222_2333 == arg0.currentIncomingPacket) {
																					var32 = var3.readString(408243882);
																					var5 = var3.readUnsignedShort(-250798994);
																					var6 = Class2.aClass523_44.method6233(var5, 1251417634).method3457(var3, -88636053);
																					Class81.sendSpeech(19, 0, var32, var32, var32, var6, null, var5, (byte) 82);
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (aClass222_2244 == arg0.currentIncomingPacket) {
																					var27 = var3.readUnsignedShort(-149414326);
																					var5 = var3.readUnsignedShort(864199094);
																					var33 = var3.readUnsignedShort(1027815394);
																					Class263_Sub3.method2630((byte) -14);
																					if (Class3.aClass120Array56[var27] != null) {
																						for (var31 = var5; var31 < var33; var31++) {
																							var35 = var3.readUnsignedTriByte(-1401356047);
																							if (var31 < Class3.aClass120Array56[var27].aClass114Array1400.length && Class3.aClass120Array56[var27].aClass114Array1400[var31] != null) {
																								Class3.aClass120Array56[var27].aClass114Array1400[var31].anInt1195 = var35;
																							}
																						}
																					}
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (arg0.currentIncomingPacket == aClass222_2225) {
																					if (Class503.aBoolean5914 && Class130.aFrame1498 != null) {
																						Class96.method1182(Class448.aClass330_Sub50_5555.aClass464_Sub8_7897.method5763(1958801047), -1, -1, false, -1547781361);
																					}
																					var30 = new byte[arg0.anInt26];
																					var3.method3828(var30, 0, arg0.anInt26, 1689124730);
																					var28 = Class125.method1525(var30, 0, arg0.anInt26, (byte) 1);
																					var6 = "opensn";
																					if (!client.aBoolean9198 || !Class239.method2379(var28, 1, var6, (byte) 0)) {
																						Class562.method6471(var28, true, Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-709195805) == 5, var6, client.aBoolean9042, client.aBoolean8966, (byte) 1);
																					}
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (CAMERA_SHAKE_PACKET == arg0.currentIncomingPacket) {
																					var27 = var3.readUnsignedShortA((byte) -41);
																					var5 = var3.readUnsignedByte(1152013990);
																					var33 = var3.readUnsignedByteC(-243015761);
																					var31 = var3.readUnsignedByteC(-243015761);
																					var35 = var3.readUnsignedByteS(-400233324);
																					Class263_Sub3.method2630((byte) -1);
																					client.aBooleanArray9238[var31] = true;
																					client.anIntArray9239[var31] = var33;
																					client.anIntArray9240[var31] = var5;
																					client.anIntArray9106[var31] = var27;
																					client.anIntArray9046[var31] = var35;
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (WINDOW_PANE_PACKET == arg0.currentIncomingPacket) {
																					var27 = var3.readInt1((byte) 2);
																					var5 = var3.readUnsignedByteS(-400233324);
																					var33 = var3.readInt((byte) 119);
																					var31 = var3.readLEInt(-800887494);
																					var35 = var3.readUnsignedShortA((byte) -121);
																					var37 = var3.readInt2(-793658723);
																					Class263_Sub3.method2630((byte) -63);
																					if (var5 == 2) {
																						Class134.method1575((byte) 49);
																					}
																					int[] var41 = new int[] { var33, var31, var37, var27 };
																					client.windowPaneId = var35;
																					Class441.method5610(var35, var41, (byte) 95);
																					Class476.method5960(false, (short) 2499);
																					Class460.method5692(client.windowPaneId, var41, 63416877);
																					for (var11 = 0; var11 < 113; var11++) {
																						client.aBooleanArray9230[var11] = true;
																					}
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (arg0.currentIncomingPacket == aClass222_2240) {
																					var27 = var3.readInt1((byte) 2);
																					var5 = var3.readInt((byte) 98);
																					Class263_Sub3.method2630((byte) -34);
																					Class134.method1577(var5, 1, var27, -1, 1813890882);
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (arg0.currentIncomingPacket == CLAN_SETTINGS_PACKET) {
																					client.anInt9129 = client.anInt9268;
																					var26 = var3.readUnsignedByte(1848547137) == 1;
																					if (arg0.anInt26 != 1) {
																						if (var26) {
																							CacheIndex.aClass154_1450 = new Class154(var3);
																						} else {
																							Class412.aClass154_4258 = new Class154(var3);
																						}
																						arg0.currentIncomingPacket = null;
																						return true;
																					}
																					if (var26) {
																						CacheIndex.aClass154_1450 = null;
																					} else {
																						Class412.aClass154_4258 = null;
																					}
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (arg0.currentIncomingPacket == PLAYERS_OVER_NPCS_PACKET) {
																					var27 = var3.readUnsignedByte(1429984549);
																					Class263_Sub3.method2630((byte) -128);
																					client.anInt9097 = var27;
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (INTERFACE_CONFIG_PACKET == arg0.currentIncomingPacket) {
																					var27 = var3.readUnsignedByteS(-400233324);
																					var5 = var3.readInt((byte) 45);
																					Class263_Sub3.method2630((byte) -112);
																					Class99.method1205(var5, var27, (byte) 124);
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (FRIENDS_CHAT_PACKET == arg0.currentIncomingPacket) {
																					client.anInt9109 = client.anInt9268;
																					if (arg0.anInt26 == 0) {
																						client.aString8968 = null;
																						client.aString9233 = null;
																						Class452.anInt5561 = 0;
																						Class95_Sub22.aClass13Array7210 = null;
																						arg0.currentIncomingPacket = null;
																						return true;
																					}
																					client.aString9233 = var3.readString(2138616559);
																					var26 = var3.readUnsignedByte(1537832088) == 1;
																					if (var26) {
																						var3.readString(1140202240);
																					}
																					var29 = var3.readLong(-1783989611);
																					client.aString8968 = Class360.method4244(var29);
																					Class291.aByte2979 = var3.readByte((byte) -1);
																					var31 = var3.readUnsignedByte(1930447454);
																					if (var31 == 255) {
																						arg0.currentIncomingPacket = null;
																						return true;
																					}
																					Class452.anInt5561 = var31;
																					Class13[] var8 = new Class13[100];
																					for (var37 = 0; var37 < Class452.anInt5561 && var37 <= 99; var37++) {
																						var8[var37] = new Class13();
																						var8[var37].aString172 = var3.readString(287108437);
																						var26 = var3.readUnsignedByte(1705805630) == 1;
																						if (var26) {
																							var8[var37].aString171 = var3.readString(-1275755565);
																						} else {
																							var8[var37].aString171 = var8[var37].aString172;
																						}
																						var8[var37].aString170 = Class531.method6297(var8[var37].aString171, -1668568374);
																						var8[var37].anInt169 = var3.readUnsignedShort(555486020);
																						var8[var37].aByte173 = var3.readByte((byte) -7);
																						var8[var37].aString168 = var3.readString(-1367936345);
																						if (var8[var37].aString171.equals(Class263_Sub2.myPlayer.aString10221)) {
																							Class513.aByte5966 = var8[var37].aByte173;
																						}
																					}
																					var39 = false;
																					var10 = Class452.anInt5561;
																					while (var10 > 0) {
																						var39 = true;
																						var10--;
																						for (var11 = 0; var11 < var10; var11++) {
																							if (var8[var11].aString170.compareTo(var8[var11 + 1].aString170) > 0) {
																								Class13 var46 = var8[var11];
																								var8[var11] = var8[var11 + 1];
																								var8[var11 + 1] = var46;
																								var39 = false;
																							}
																						}
																						if (var39) {
																							if (arg1 <= 5) {
																							}
																							break;
																						}
																					}
																					Class95_Sub22.aClass13Array7210 = var8;
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (arg0.currentIncomingPacket == ALIVE_PACKET) {
																					arg0.currentIncomingPacket = null;
																					return false;
																				} else if (arg0.currentIncomingPacket == PRIVATE_GAME_BAR_STAGE_PACKET) {
																					Class355.aClass496_3639 = Class501.method6123(var3.readUnsignedByte(-53027625), (byte) 47);
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else if (aClass222_2325 == arg0.currentIncomingPacket) {
																					var26 = var3.readUnsignedByte(1383513682) == 1;
																					var28 = var3.readString(1812903645);
																					var6 = var28;
																					if (var26) {
																						var6 = var3.readString(-130543702);
																					}
																					var7 = var3.readUnsignedShort(1431695309);
																					var9 = var3.readUnsignedTriByte(-1401356047);
																					var11 = var3.readUnsignedByte(1359011459);
																					var12 = var3.readUnsignedShort(294517201);
																					long var13 = var9 + (var7 << 32);
																					var15 = false;
																					var16 = 0;
																					while (true) {
																						if (var16 >= 100) {
																							if (var11 <= 1 && Class65.foundPlayer(var6, -1099153198)) {
																								var15 = true;
																							}
																							break;
																						}
																						if (client.aLongArray9064[var16] == var13) {
																							var15 = true;
																							break;
																						}
																						var16++;
																					}
																					if (!var15) {
																						client.aLongArray9064[client.anInt9190] = var13;
																						client.anInt9190 = (client.anInt9190 + 1) % 100;
																						var72 = Class2.aClass523_44.method6233(var12, 1527228650).method3457(var3, 743111992);
																						if (var11 == 2) {
																							Class81.sendSpeech(18, 0, Class325_Sub4.method3225(1, 1453501599) + var28, Class325_Sub4.method3225(1, -1738837264) + var6, var28, var72, null, var12, (byte) 67);
																						} else if (var11 == 1) {
																							Class81.sendSpeech(18, 0, Class325_Sub4.method3225(0, -1047996574) + var28, Class325_Sub4.method3225(0, -1679432416) + var6, var28, var72, null, var12, (byte) 19);
																						} else {
																							Class81.sendSpeech(18, 0, var28, var6, var28, var72, null, var12, (byte) 72);
																						}
																					}
																					arg0.currentIncomingPacket = null;
																					return true;
																				} else {
																					Class207.method2195((arg0.currentIncomingPacket == null ? -1 : arg0.currentIncomingPacket.anInt2350) + Class215.aString2081 + (arg0.aClass222_35 == null ? -1 : arg0.aClass222_35.anInt2350) + Class215.aString2081 + (arg0.aClass222_36 == null ? -1 : arg0.aClass222_36.anInt2350) + " " + arg0.anInt26, new RuntimeException(), -306254718);
																					Class330_Sub31.logout(false, 1784034144);
																					return true;
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} else {
				var26 = var3.readByte((byte) 39) == 1;
				if (ItemDefinitions.OLD_ITEMS == var26) {
					arg0.currentIncomingPacket = null;
					return true;
				} else {
					ItemDefinitions.OLD_ITEMS = var26;
					Class50.method632(false, (byte) 1);
					arg0.currentIncomingPacket = null;
					return true;
				}
			}
		} catch (RuntimeException var25) {
			throw Class476.method5964(var25, "lg.jy(" + ')');
		}
	}

	public static void method2272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			Class330_Sub10 var8 = null;
			for (Class330_Sub10 var9 = (Class330_Sub10) Class330_Sub10.aClass471_7587.method5869(539664854); var9 != null; var9 = (Class330_Sub10) Class330_Sub10.aClass471_7587.method5873((byte) -62)) {
				if (arg0 == var9.anInt7581 && var9.anInt7582 == arg1 && arg2 == var9.anInt7577 && arg3 == var9.anInt7575) {
					var8 = var9;
					break;
				}
			}
			if (var8 == null) {
				var8 = new Class330_Sub10();
				var8.anInt7581 = arg0;
				var8.anInt7575 = arg3;
				var8.anInt7582 = arg1;
				var8.anInt7577 = arg2;
				if (arg1 >= 0 && arg2 >= 0 && arg1 < client.aClass304_9030.method2990(-1666536826) && arg2 < client.aClass304_9030.method3033((byte) 9)) {
					Class313.method3117(var8, -727050650);
				}
				Class330_Sub10.aClass471_7587.method5878(var8, (short) 8192);
			}
			var8.anInt7589 = arg4;
			var8.anInt7585 = arg5;
			var8.anInt7574 = arg6;
			var8.aBoolean7583 = true;
			var8.aBoolean7586 = false;
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "ji.r(" + ')');
		}
	}

	public static int[] method2273(Class330_Sub34 arg0, byte arg1) {
		try {
			Buffer var2 = new Buffer(518);
			int[] var3 = new int[4];
			int var4;
			for (var4 = 0; var4 < 4; var4++) {
				var3[var4] = (int) (Math.random() * 9.9999999E7D);
			}
			var2.addByte(10, (byte) 90);
			var2.addInt(var3[0], 1965508160);
			var2.addInt(var3[1], 1965508160);
			var2.addInt(var3[2], 1965508160);
			var2.addInt(var3[3], 1965508160);
			for (var4 = 0; var4 < 10; var4++) {
				var2.addInt((int) (Math.random() * 9.9999999E7D), 1965508160);
			}
			var2.addShort((int) (Math.random() * 9.9999999E7D), (byte) 42);
			var2.applyRSA(Class2.aBigInteger43, Class2.aBigInteger41, -666670013);
			arg0.aClass330_Sub46_Sub2_7729.method3749(var2.payload, 0, var2.offset, (byte) 71);
			return var3;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ji.k(" + ')');
		}
	}

}
