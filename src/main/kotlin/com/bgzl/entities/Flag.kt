package com.bgzl.entities

/**
 * Flag that can be set to bug or attachment. Defines bug status or status of the work about this bug
 */
data class Flag(

    /**
     * The ID of the flag.
     */
    val id: Int,

    /**
     * The name of the flag.
     */
    val name: String,

    /**
     * The type ID of the flag.
     */
    val typeId: Int,

    /**
     * The timestamp when this flag was originally created.
     */
    val creationTime: Long,

    /**
     * The timestamp when the flag was last modified.
     */
    val modificationDate: Long,

    /**
     * The current status of the flag such as ?, +, or -.
     */
    val status: String,

    /**
     * The login name of the user who created or last modified the flag.
     */
    val setter: String?,

    /**
     * The login name of the user this flag has been requested to be granted or denied. Note, this field is only returned if a requestee is set.
     */
    val requestee: String?
)