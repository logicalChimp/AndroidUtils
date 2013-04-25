package uk.co.mentalspace.android.utils;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class MWIntentGenerator implements MW {

	public static Intent getAnnounceIntent(Context ctx, String appId, String appName) {
		Intent announce = new Intent();
		announce.setAction(ACTION_ANNOUNCE);
		Bundle b = new Bundle();
		b.putString(EXTRA_APP_ID, appId);
		b.putString(EXTRA_APP_NAME, appName);
		announce.putExtras(b);
		return announce;
	}
	
	public static Intent getUpdateIntent(Context ctx, String appId, int[] array) {
		Intent update = new Intent();
		update.setAction(ACTION_UPDATE);
		Bundle b = new Bundle();
		b.putString(EXTRA_APP_ID, appId);
		b.putIntArray(EXTRA_INT_ARRAY, array);
		update.putExtras(b);
		return update;
	}
	
	public static Intent getStartIntent(Context ctx, String appId, String appName) {
		Intent start = new Intent(ACTION_START);
		Bundle b = new Bundle();
		b.putString(EXTRA_APP_ID, appId);
		b.putString(EXTRA_APP_NAME, appName);
		start.putExtras(b);
		return start;
	}
	
	public static Intent getStopIntent(Context ctx, String appId, String appName) {
		Intent stop = new Intent(ACTION_STOP);
		Bundle b = new Bundle();
		b.putString(EXTRA_APP_ID, appId);
		b.putString(EXTRA_APP_NAME, appName);
		stop.putExtras(b);
		return stop;
	}
	
	public static Intent getNotificationIntent(Context ctx, String oled1, String oled2) {
		Intent notification = new Intent(ACTION_NOTIFICATION);
		Bundle b = new Bundle();
		b.putString(EXTRA_OLED1, oled1);
		b.putString(EXTRA_OLED2, oled2);
		notification.putExtras(b);
		return notification;
	}

	public static Intent getNotificationIntent(Context ctx, String oled1a, String oled1b, String oled2a, String oled2b) {
		Intent notification = new Intent(ACTION_NOTIFICATION);
		Bundle b = new Bundle();
		b.putString(EXTRA_OLED1a, oled1a);
		b.putString(EXTRA_OLED1b, oled1b);
		b.putString(EXTRA_OLED2a, oled2a);
		b.putString(EXTRA_OLED2b, oled2b);
		notification.putExtras(b);
		return notification;
	}

	public static Intent getNotificationIntent(Context ctx, String text, String title, int[] icon) {
		return getNotificationIntent(ctx, text, title, icon, true);
	}
	
	public static Intent getNotificationIntent(Context ctx, String text, String title, int[] icon, boolean sticky) {
		Intent notification = new Intent(ACTION_NOTIFICATION);
		Bundle b = new Bundle();
		b.putString(EXTRA_TEXT, text);
		b.putString(EXTRA_TITLE, title);
		b.putIntArray(EXTRA_ICON, icon);
		b.putBoolean(EXTRA_STICKY, sticky);
		notification.putExtras(b);
		return notification;
	}

	public static Intent getNotificationIntent(Context ctx, int[] image) {
		Intent notification = new Intent(ACTION_NOTIFICATION);
		Bundle b = new Bundle();
		b.putIntArray(EXTRA_INT_ARRAY, image);
		notification.putExtras(b);
		return notification;
	}

	public static Intent getNotificationIntent(Context ctx, byte[] image) {
		Intent notification = new Intent(ACTION_NOTIFICATION);
		Bundle b = new Bundle();
		b.putByteArray(EXTRA_BYTE_ARRAY, image);
		notification.putExtras(b);
		return notification;
	}

	public static Intent getVibrateIntent(Context ctx, int on, int off, int cycles) {
		Intent vibrate = new Intent(ACTION_VIBRATE);
		Bundle b = new Bundle();
		b.putInt(EXTRA_VIBRATE_ON, on);
		b.putInt(EXTRA_VIBRATE_OFF, off);
		b.putInt(EXTRA_VIBRATE_CYCLES, cycles);
		vibrate.putExtras(b);
		return vibrate;
	}
	
	public static Intent getSilentModeIntent(Context ctx, boolean enabled) {
		Intent silent = new Intent(ACTION_SILENT_MODE);
		Bundle b = new Bundle();
		b.putBoolean(EXTRA_SILENT_MODE_ENABLED, enabled);
		silent.putExtras(b);
		return silent;
	}
	
	public static Intent getWidgetUpdateIntent(Context ctx, String widgetId, String desc, int width, int height, int priority, int[] array) {
		Intent widget = new Intent(ACTION_WIDGET_UPDATE);
		Bundle b = new Bundle();
		b.putString(EXTRA_WIDGET_ID, widgetId);
		b.putString(EXTRA_WIDGET_DESC, desc);
		b.putInt(EXTRA_WIDGET_WIDTH, width);
		b.putInt(EXTRA_WIDGET_HEIGHT, height);
		b.putInt(EXTRA_WIDGET_PRIORITY, priority);
		b.putIntArray(EXTRA_INT_ARRAY, array);
		widget.putExtras(b);
		return widget;
	}
}
