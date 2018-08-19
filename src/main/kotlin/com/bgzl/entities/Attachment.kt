package com.bgzl.entities

/**
 * File attachment to the bug
 * */
data class Attachment(
    /**
     * The numeric ID of the attachment.
     * */
    val id: Int,

    /**
     * The numeric ID of the bug that the attachment is attached to.
     */
    val bugId: Int,

    /**
     * The raw data of the attachment, encoded as Base64.
     * */
    val data: String,

    /**
     * The length (in bytes) of the attachment.
     */
    val size: Int,

    /**
     * The file name of the attachment.
     */
    val fileName: String,

    /**
     * A short string describing the attachment.
     */
    val summary: String,

    /**
     * The MIME type of the attachment.
     */
    val contentType: String,

    /**
     * The time the attachment was created.
     */
    val creationTime: Long,

    /**
     * The last time the attachment was modified.
     */
    val lastChangeTime: Long,

    /**
     * true if the attachment is private (only visible to a certain group called the "insidergroup", false otherwise.
     */
    val private: Boolean,

    /**
     *  true if the attachment is obsolete, false otherwise.
     */
    val obsolete: Boolean,

    /**
     * true if the attachment is a patch, false otherwise.
     */
    val patch: Boolean,

    /**
     * The login name of the user that created the attachment.
     */
    val creator: String,

    /**
     * List of flags currently set for each attachment.
     */
    val flags: List<Flag>
)