package com.sysaxiom.callrecordingapp

import android.content.Intent
import android.app.admin.DeviceAdminReceiver
import android.content.Context


class DeviceAdminDemo : DeviceAdminReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        super.onReceive(context, intent)
    }

    override fun onEnabled(context: Context, intent: Intent) {}

    override fun onDisabled(context: Context, intent: Intent) {}
}