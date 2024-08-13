package com.haikal.photos.presentation.sign_up;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/haikal/photos/presentation/sign_up/SignUpViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/haikal/photos/datasource/IRepository;", "(Lcom/haikal/photos/datasource/IRepository;)V", "insertUser", "", "user", "Lcom/haikal/photos/datasource/local/model/User;", "state", "Lkotlin/Function1;", "Lcom/haikal/photos/presentation/sign_up/SignUpState;", "app_debug"})
public final class SignUpViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.haikal.photos.datasource.IRepository repository = null;
    
    public SignUpViewModel(@org.jetbrains.annotations.NotNull()
    com.haikal.photos.datasource.IRepository repository) {
        super();
    }
    
    public final void insertUser(@org.jetbrains.annotations.NotNull()
    com.haikal.photos.datasource.local.model.User user, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.haikal.photos.presentation.sign_up.SignUpState, kotlin.Unit> state) {
    }
}