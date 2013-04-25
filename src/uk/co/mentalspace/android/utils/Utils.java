package uk.co.mentalspace.android.utils;

import java.io.IOException;
import java.io.InputStream;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;

public class Utils {

	private static final byte WHITE_PIXEL_BIT = 0x0;
	private static final byte BLACK_PIXEL_BIT = 0x1;
	
	public static Bitmap loadBitmapFromAssets(Context context, String path) {		
		try {
			InputStream inputStream = context.getAssets().open(path);
	        Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
	        inputStream.close();
	        return bitmap;
		} catch (IOException e) {
			return null;
		}
	}
	
	//bitmapToBuffer function copied from Regattapp on Github, by Marius Gundersen
	public static byte[] bitmapToBuffer(Bitmap bitmap) {
		final int WIDTH = bitmap.getWidth();
		final int HEIGHT = bitmap.getHeight();
		
		byte buffer[] = new byte[(WIDTH * HEIGHT) / 8];
		for (int x=0; x<WIDTH; x++) {
			for (int y=0; y<HEIGHT; y++) {
				int color = bitmap.getPixel(x, y);
				
				byte pixelBit = (Color.BLACK == color) ? BLACK_PIXEL_BIT : WHITE_PIXEL_BIT;
				int pixelIndex = (y * WIDTH) + x;
				int byteIndex = pixelIndex / 8;
				buffer[byteIndex] = (byte)(buffer[byteIndex] | (pixelBit << (pixelIndex % 8)));
			}
		}
		return buffer;
	}
	
	//bitmapToPixelArray function copied from Regattapp on Github, by Marius Gundersen
	public static int[] bitmapToPixelArray(Bitmap bitmap) {
		final int WIDTH = bitmap.getWidth();
		final int HEIGHT = bitmap.getHeight();
		
		int buffer[] = new int[(WIDTH * HEIGHT)];
		for (int x=0; x<WIDTH; x++) {
			for (int y=0; y<HEIGHT; y++) {
				int color = bitmap.getPixel(x, y);
				
				int pixelIndex = (y * WIDTH) + x;
				buffer[pixelIndex] = color;
			}
		}
		return buffer;
	}
	
}
