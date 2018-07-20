//
//  ViewController.swift
//  bgzl
//
//  Created by Andrei Mukamolau on 7/20/18.
//  Copyright © 2018 bgzl. All rights reserved.
//

import Cocoa
import os


class ViewController: NSViewController, NSControlTextEditingDelegate  {
    @IBOutlet weak var loginField: NSTextField!
    @IBOutlet weak var loginButton: NSButton!
    @IBOutlet weak var passwordField: NSSecureTextField!
    @IBOutlet weak var signInProgressIndicator: NSProgressIndicator!
    
    override func viewDidLoad() {
    super.viewDidLoad()
        
    }


    override var representedObject: Any? {
    didSet {
    // Update the view, if already loaded.
    }
    }
    
    override func controlTextDidChange(_ notification: Notification) {
        if ((notification.object as? NSTextField) != nil) {
            if (!loginField.stringValue.isEmpty && !passwordField.stringValue.isEmpty) {
                loginButton.isEnabled = true
            }
        }
    }
    
    @IBAction func tryToSignIn(_ sender: Any) {
        signInProgressIndicator.startAnimation(sender)
    }
    

}
