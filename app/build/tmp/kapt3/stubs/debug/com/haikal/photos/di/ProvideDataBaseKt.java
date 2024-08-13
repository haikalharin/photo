package com.haikal.photos.di;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u00a8\u0006\u000b"}, d2 = {"dataBaseModule", "Lorg/koin/core/module/Module;", "getDataBaseModule", "()Lorg/koin/core/module/Module;", "provideDao", "Lcom/haikal/photos/datasource/local/room/UserDao;", "userDatabase", "Lcom/haikal/photos/datasource/local/room/UserDatabase;", "provideDataBase", "application", "Landroid/app/Application;", "app_debug"})
public final class ProvideDataBaseKt {
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module dataBaseModule = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final com.haikal.photos.datasource.local.room.UserDatabase provideDataBase(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.haikal.photos.datasource.local.room.UserDao provideDao(@org.jetbrains.annotations.NotNull()
    com.haikal.photos.datasource.local.room.UserDatabase userDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getDataBaseModule() {
        return null;
    }
}