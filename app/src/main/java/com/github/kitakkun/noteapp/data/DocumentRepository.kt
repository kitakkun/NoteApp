package com.github.kitakkun.noteapp.data

import com.github.kitakkun.noteapp.ui.page.editor.editmodel.anchor.BaseStyleAnchor
import com.github.kitakkun.noteapp.ui.page.editor.editmodel.anchor.OverrideStyleAnchor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class DocumentRepository(
    private val documentDao: DocumentDao
) {
    suspend fun saveDocument(
        id: String,
        title: String,
        rawContent: String,
        baseStyleAnchors: List<BaseStyleAnchor>,
        overrideStyleAnchors: List<OverrideStyleAnchor>,
    ) = withContext(Dispatchers.IO) {
        documentDao.insert(
            DocumentEntity(
                id = id,
                title = title,
                content = rawContent,
                baseStyleAnchors = baseStyleAnchors,
                overrideStyleAnchors = overrideStyleAnchors,
            )
        )
    }

    suspend fun updateDocument(
        id: String,
        title: String,
        rawContent: String,
        baseStyleAnchors: List<BaseStyleAnchor>,
        overrideStyleAnchors: List<OverrideStyleAnchor>,
    ) = withContext(Dispatchers.IO) {
        documentDao.update(
            DocumentEntity(
                id = id,
                title = title,
                content = rawContent,
                baseStyleAnchors = baseStyleAnchors,
                overrideStyleAnchors = overrideStyleAnchors,
            )
        )
    }

    suspend fun deleteDocument(
        document: DocumentEntity,
    ) = withContext(Dispatchers.IO) {
        documentDao.delete(document)
    }

    suspend fun deleteDocumentById(
        documentId: String?,
    ) = withContext(Dispatchers.IO) {
        documentDao.deleteById(documentId)
    }

    suspend fun fetchDocuments() = withContext(Dispatchers.IO) {
        documentDao.getAll()
    }

    suspend fun getDocumentById(documentId: String?) = withContext(Dispatchers.IO) {
        documentDao.getById(documentId)
    }
}
