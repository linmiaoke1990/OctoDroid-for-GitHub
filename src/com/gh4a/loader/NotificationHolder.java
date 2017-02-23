package com.gh4a.loader;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import org.eclipse.egit.github.core.Notification;
import org.eclipse.egit.github.core.Repository;

public class NotificationHolder {
    @Nullable
    public final Notification notification;

    @NonNull
    public final Repository repository;

    private boolean mLastRepositoryNotification;

    public NotificationHolder(@NonNull Repository repository) {
        notification = null;
        this.repository = repository;
    }

    public NotificationHolder(@NonNull Notification notification) {
        this.notification = notification;
        repository = notification.getRepository();
    }

    public boolean isLastRepositoryNotification() {
        return mLastRepositoryNotification;
    }

    public void setIsLastRepositoryNotification(boolean value) {
        mLastRepositoryNotification = value;
    }
}
