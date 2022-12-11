package com.bemotioninc.sss.utils;

public class NotificationHelper {

   /* private Context mContext;
    private NotificationManager mNotificationManager;
    private NotificationCompat.Builder mBuilder;
    public static final String NOTIFICATION_CHANNEL_ID = "10001";

    public NotificationHelper(Context context) {
        mContext = context;
    }

    *//**
     * Create and push the notification
     *//*
    public void createNotification(NotificationMessage notificationMessage, Body body) {
        PendingIntent resultPendingIntent = null;
        switch (notificationMessage.getAction()) {

            case ORDER_DETAILS:
                Bundle bundle = new Bundle();
                bundle.putString("orderId", body.getOrderId());

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.S) {
                    resultPendingIntent = new NavDeepLinkBuilder(mContext)
                            .setGraph(R.navigation.client_home_navigation)
                            .setDestination(R.id.orderDetailsFragment)
                            .setArguments(bundle)
                            .setComponentName(HomeActivity.class)
                            .createTaskStackBuilder().getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);
                }else {
                    resultPendingIntent = new NavDeepLinkBuilder(mContext)
                            .setGraph(R.navigation.client_home_navigation)
                            .setDestination(R.id.orderDetailsFragment)
                            .setArguments(bundle)
                            .setComponentName(HomeActivity.class)
                            .createTaskStackBuilder().getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);

                }
                break;
            default:
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.S) {
                    resultPendingIntent = new NavDeepLinkBuilder(mContext)
                            .setGraph(R.navigation.client_home_navigation)
                            .setDestination(R.id.nav_home)
                            .setComponentName(HomeActivity.class)
                            .createTaskStackBuilder().getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);
                }else {
                    resultPendingIntent = new NavDeepLinkBuilder(mContext)
                            .setGraph(R.navigation.client_home_navigation)
                            .setDestination(R.id.nav_home)
                            .setComponentName(HomeActivity.class)
                            .createTaskStackBuilder().getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT );

                }
                break;

        }


        mBuilder = new NotificationCompat.Builder(mContext, NOTIFICATION_CHANNEL_ID);
        mBuilder.setSmallIcon(R.mipmap.ic_launcher);
        mBuilder.setContentTitle(notificationMessage.getTitle())
                .setContentText(notificationMessage.getMessage())
                .setAutoCancel(true)
                .setSound(Settings.System.DEFAULT_NOTIFICATION_URI)
                .setContentIntent(resultPendingIntent);

        mNotificationManager = (NotificationManager) mContext.getSystemService(Context.NOTIFICATION_SERVICE);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            int importance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel notificationChannel = new NotificationChannel(NOTIFICATION_CHANNEL_ID, "NOTIFICATION_CHANNEL_NAME", importance);
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(Color.RED);
            notificationChannel.enableVibration(true);
            notificationChannel.setVibrationPattern(new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400});
            assert mNotificationManager != null;
            mBuilder.setChannelId(NOTIFICATION_CHANNEL_ID);
            mNotificationManager.createNotificationChannel(notificationChannel);
        }
        assert mNotificationManager != null;
        mNotificationManager.notify((int) System.currentTimeMillis() *//* Request Code *//*, mBuilder.build());
    }*/

}