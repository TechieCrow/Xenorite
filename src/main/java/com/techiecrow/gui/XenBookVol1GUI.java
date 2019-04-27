//I would just like to thank for his tutorial on this, it helps A LOT!
//http://jabelarminecraft.blogspot.co.uk/p/minecraft-modding-block-with-simple-gui.html

package com.techiecrow.gui;

import com.techiecrow.reference.Reference;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;

public class XenBookVol1GUI extends GuiScreen
{
	private final int bookImageHeight = 192;
	private final int bookImageWidth = 192;
	private int currPage = 0;
	private static final int bookTotalPages = 4;
	private static ResourceLocation[] bookPageTextures = new ResourceLocation[bookTotalPages];
	private static String[] stringPageText = new String[bookTotalPages];
	private GuiButton buttonDone;
	private NextPageButton buttonNextPage;
	private NextPageButton buttonPreviousPage;

	public XenBookVol1GUI()
	{
		bookPageTextures[0] = new ResourceLocation(Reference.MOD_ID + ":textures/gui/book.png");
		bookPageTextures[1] = new ResourceLocation(Reference.MOD_ID + ":textures/gui/book.png");
		bookPageTextures[2] = new ResourceLocation(Reference.MOD_ID + ":textures/gui/book.png");
		stringPageText[0] = "The evil that is in this world almost always come of ignorance and good intentions may do as much harm as malevolence if they lack understanding.\n\n -Albert Camus";
		stringPageText[1] = "At the time I was just a young boy of 10 years old, working as an apprentice in the gensis tower, I was bright for my age and as all kids do I though I had the answers to everything as such I would often neglect my dutys in favor of more entertaining past times.";
		stringPageText[2] = "This book is a WIP, there will be a number of books explaining the reasn why the ores act the way they do and how Xen Beast came into being!";
		stringPageText[3] = "- TechieCrow";
	}

	@Override
	public void initGui()
	{
		buttonList.clear();
		Keyboard.enableRepeatEvents(true);

		buttonDone = new GuiButton(0, width / 2 + 2, 4 + bookImageHeight, 98, 20, I18n.format("gui.done", new Object[0]));

		buttonList.add(buttonDone);
		int offsetFromScreenLeft = (width - bookImageWidth) / 2;
		buttonList.add(buttonNextPage = new NextPageButton(1, offsetFromScreenLeft + 120, 156, true));
		buttonList.add(buttonPreviousPage = new NextPageButton(2, offsetFromScreenLeft + 38, 156, false));
	}

	@Override
	public void updateScreen()
	{
		buttonDone.visible = (currPage == bookTotalPages - 1);
		buttonNextPage.visible = (currPage < bookTotalPages - 1);
		buttonPreviousPage.visible = currPage > 0;
	}

	@Override
	public void drawScreen(int parWidth, int parHeight, float p_73863_3_)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		if (currPage == 0)
		{
			mc.getTextureManager().bindTexture(bookPageTextures[0]);
		}
		else
		{
			mc.getTextureManager().bindTexture(bookPageTextures[1]);
		}
		int offsetFromScreenLeft = (width - bookImageWidth) / 2;
		drawTexturedModalRect(offsetFromScreenLeft, 2, 0, 0, bookImageWidth, bookImageHeight);
		int widthOfString;
		String stringPageIndicator = I18n.format("book.pageIndicator", new Object[]
		{ Integer.valueOf(currPage + 1), bookTotalPages });
		widthOfString = fontRendererObj.getStringWidth(stringPageIndicator);
		fontRendererObj.drawString(stringPageIndicator, offsetFromScreenLeft - widthOfString + bookImageWidth - 44, 18, 0);
		fontRendererObj.drawSplitString(stringPageText[currPage], offsetFromScreenLeft + 36, 34, 116, 0);
		super.drawScreen(parWidth, parHeight, p_73863_3_);

	}

	@Override
	protected void mouseClickMove(int parMouseX, int parMouseY, int parLastButtonClicked, long parTimeSinceMouseClick)
	{

	}

	@Override
	protected void actionPerformed(GuiButton parButton)
	{
		if (parButton == buttonDone)
		{
			mc.displayGuiScreen((GuiScreen) null);
		}
		else if (parButton == buttonNextPage)
		{
			if (currPage < bookTotalPages - 1)
			{
				++currPage;
			}
		}
		else if (parButton == buttonPreviousPage)
		{
			if (currPage > 0)
			{
				--currPage;
			}
		}
	}

	@Override
	public void onGuiClosed()
	{

	}

	@Override
	public boolean doesGuiPauseGame()
	{
		return true;
	}

	@SideOnly(Side.CLIENT)
	static class NextPageButton extends GuiButton
	{
		private final boolean isNextButton;

		public NextPageButton(int parButtonId, int parPosX, int parPosY, boolean parIsNextButton)
		{
			super(parButtonId, parPosX, parPosY, 23, 13, "");
			isNextButton = parIsNextButton;
		}

		@Override
		public void drawButton(Minecraft mc, int parX, int parY)
		{
			if (visible)
			{
				boolean isButtonPressed = (parX >= xPosition && parY >= yPosition && parX < xPosition + width && parY < yPosition + height);
				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
				mc.getTextureManager().bindTexture(bookPageTextures[1]);
				int textureX = 0;
				int textureY = 192;

				if (isButtonPressed)
				{
					textureX += 23;
				}

				if (!isNextButton)
				{
					textureY += 13;
				}

				drawTexturedModalRect(xPosition, yPosition, textureX, textureY, 23, 13);
			}
		}
	}
}