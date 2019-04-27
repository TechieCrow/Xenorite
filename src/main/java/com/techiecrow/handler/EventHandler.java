package com.techiecrow.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.util.ChatComponentText;

public class EventHandler
{

	@SubscribeEvent
	public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event)
	{
		if (UpdateHandler.show)
			event.player.addChatMessage(new ChatComponentText(UpdateHandler.updateStatus));
	}
}