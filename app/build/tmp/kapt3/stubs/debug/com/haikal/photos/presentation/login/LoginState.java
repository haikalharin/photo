package com.haikal.photos.presentation.login;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/haikal/photos/presentation/login/LoginState;", "", "()V", "Error", "Loading", "Success", "Lcom/haikal/photos/presentation/login/LoginState$Error;", "Lcom/haikal/photos/presentation/login/LoginState$Loading;", "Lcom/haikal/photos/presentation/login/LoginState$Success;", "app_debug"})
public abstract class LoginState {
    
    private LoginState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/haikal/photos/presentation/login/LoginState$Error;", "Lcom/haikal/photos/presentation/login/LoginState;", "errMsg", "", "(Ljava/lang/String;)V", "getErrMsg", "()Ljava/lang/String;", "app_debug"})
    public static final class Error extends com.haikal.photos.presentation.login.LoginState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String errMsg = null;
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.String errMsg) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getErrMsg() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/haikal/photos/presentation/login/LoginState$Loading;", "Lcom/haikal/photos/presentation/login/LoginState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Loading extends com.haikal.photos.presentation.login.LoginState {
        @org.jetbrains.annotations.NotNull()
        public static final com.haikal.photos.presentation.login.LoginState.Loading INSTANCE = null;
        
        private Loading() {
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/haikal/photos/presentation/login/LoginState$Success;", "Lcom/haikal/photos/presentation/login/LoginState;", "user", "Lcom/haikal/photos/datasource/local/model/User;", "(Lcom/haikal/photos/datasource/local/model/User;)V", "getUser", "()Lcom/haikal/photos/datasource/local/model/User;", "app_debug"})
    public static final class Success extends com.haikal.photos.presentation.login.LoginState {
        @org.jetbrains.annotations.NotNull()
        private final com.haikal.photos.datasource.local.model.User user = null;
        
        public Success(@org.jetbrains.annotations.NotNull()
        com.haikal.photos.datasource.local.model.User user) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.haikal.photos.datasource.local.model.User getUser() {
            return null;
        }
    }
}