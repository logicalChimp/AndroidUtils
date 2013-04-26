package uk.co.mentalspace.android.utils;

import android.util.Log;

public class DebugUtils {

	public static void dumpStackTrace(String label) {
		StackTraceElement[] stes = Thread.currentThread().getStackTrace();
		Log.d(label, "Dumping thread stack...");
		for (StackTraceElement ste : stes) {
			Log.d("  at "+label, ste.getFileName()+" : "+ste.getMethodName()+" : "+ste.getLineNumber());
		}
		Log.d(label, "...dump complete.");
	}
}
