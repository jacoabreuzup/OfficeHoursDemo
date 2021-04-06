//
//  Styles.swift
//  OfficeHoursDemo
//
//  Created by João Jacó S. Abreu on 06/04/21.
//

import UIKit
import Beagle

struct AppTheme {

    static let theme = Beagle.AppTheme(styles: [
        "DesignSystem.Text": Self.designSystemText,
        "DesignSystem.Button": Self.designSystemButton
    ])

    static func designSystemText() -> (UITextView?) -> Void {
        return BeagleStyle.text(font: .boldSystemFont(ofSize: 18), color: .darkGray)
    }
    
    static func designSystemButton() -> (UIButton?) -> Void {
        return BeagleStyle.button(withTitleColor: .white)
        <> {
            $0?.backgroundColor = .darkGray
        }
    }

}
