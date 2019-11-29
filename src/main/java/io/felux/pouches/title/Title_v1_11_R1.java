package io.felux.pouches.title;

import org.bukkit.entity.*;
import org.bukkit.craftbukkit.v1_11_R1.entity.*;
import net.minecraft.server.v1_11_R1.*;

public class Title_v1_11_R1 implements Title
{
    public Title_v1_11_R1() {
        super();
    }
    
    @Override
    public void sendTitle(final Player player, final String message) {
        final PacketPlayOutTitle title2 = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.TITLE, IChatBaseComponent.ChatSerializer.a(message));
        final PacketPlayOutTitle length = new PacketPlayOutTitle(0, 11, 10);
        ((CraftPlayer)player.getPlayer()).getHandle().playerConnection.sendPacket((Packet)title2);
        ((CraftPlayer)player.getPlayer()).getHandle().playerConnection.sendPacket((Packet)length);
    }
    
    @Override
    public void sendSubtitle(final Player player, final String message) {
        final PacketPlayOutTitle title2 = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.SUBTITLE, IChatBaseComponent.ChatSerializer.a(message));
        ((CraftPlayer)player.getPlayer()).getHandle().playerConnection.sendPacket((Packet)title2);
    }
}
