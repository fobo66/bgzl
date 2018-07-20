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
     * Array of objects, each containing the information about the flag currently set for each attachment.
     */
    val flags: Array<Flag>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as Attachment

        if (id != other.id) return false
        if (bugId != other.bugId) return false
        if (data != other.data) return false
        if (size != other.size) return false
        if (fileName != other.fileName) return false
        if (summary != other.summary) return false
        if (creationTime != other.creationTime) return false
        if (lastChangeTime != other.lastChangeTime) return false
        if (private != other.private) return false
        if (obsolete != other.obsolete) return false
        if (patch != other.patch) return false
        if (creator != other.creator) return false
        if (!flags.contentDeepEquals(other.flags)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + bugId
        result = 31 * result + data.hashCode()
        result = 31 * result + size
        result = 31 * result + fileName.hashCode()
        result = 31 * result + summary.hashCode()
        result = 31 * result + creationTime.hashCode()
        result = 31 * result + lastChangeTime.hashCode()
        result = 31 * result + private.hashCode()
        result = 31 * result + obsolete.hashCode()
        result = 31 * result + patch.hashCode()
        result = 31 * result + creator.hashCode()
        result = 31 * result + flags.contentDeepHashCode()

        return result
    }
}