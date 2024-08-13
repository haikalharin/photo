package com.haikal.photos.presentation.sign_up;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0012\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J0\u0010\u0019\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0016\u0010\"\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001bH\u0016J\b\u0010#\u001a\u00020\u0014H\u0002J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&H\u0002J\f\u0010\'\u001a\u00020\u0014*\u00020\u0005H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006("}, d2 = {"Lcom/haikal/photos/presentation/sign_up/SignUpActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "()V", "binding", "Lcom/haikal/photos/databinding/ActivitySignUpBinding;", "getBinding", "()Lcom/haikal/photos/databinding/ActivitySignUpBinding;", "binding$delegate", "Lkotlin/Lazy;", "role", "", "roles", "Ljava/util/ArrayList;", "viewModel", "Lcom/haikal/photos/presentation/sign_up/SignUpViewModel;", "getViewModel", "()Lcom/haikal/photos/presentation/sign_up/SignUpViewModel;", "viewModel$delegate", "hideProgressbar", "", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemSelected", "parent", "Landroid/widget/AdapterView;", "view", "Landroid/view/View;", "position", "", "id", "", "onNothingSelected", "showProgressbar", "signUp", "user", "Lcom/haikal/photos/datasource/local/model/User;", "setupSpinner", "app_debug"})
public final class SignUpActivity extends androidx.appcompat.app.AppCompatActivity implements android.widget.AdapterView.OnItemSelectedListener {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private java.lang.String role;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.String> roles = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    
    public SignUpActivity() {
        super();
    }
    
    private final com.haikal.photos.presentation.sign_up.SignUpViewModel getViewModel() {
        return null;
    }
    
    private final com.haikal.photos.databinding.ActivitySignUpBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    private final void setupSpinner(com.haikal.photos.databinding.ActivitySignUpBinding $this$setupSpinner) {
    }
    
    private final void signUp(com.haikal.photos.datasource.local.model.User user) {
    }
    
    private final void showProgressbar() {
    }
    
    private final void hideProgressbar() {
    }
    
    @java.lang.Override()
    public void onItemSelected(@org.jetbrains.annotations.Nullable()
    android.widget.AdapterView<?> parent, @org.jetbrains.annotations.Nullable()
    android.view.View view, int position, long id) {
    }
    
    @java.lang.Override()
    public void onNothingSelected(@org.jetbrains.annotations.Nullable()
    android.widget.AdapterView<?> parent) {
    }
}