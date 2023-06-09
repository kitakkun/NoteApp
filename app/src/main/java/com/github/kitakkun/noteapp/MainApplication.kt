package com.github.kitakkun.noteapp

import android.app.Application
import com.github.kitakkun.noteapp.data.dataModule
import com.github.kitakkun.noteapp.di.appModule
import com.github.kitakkun.noteapp.editor.editorModule
import com.github.kitakkun.noteapp.finder.finderModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            modules(appModule, dataModule, finderModule, editorModule)
        }
    }
}
