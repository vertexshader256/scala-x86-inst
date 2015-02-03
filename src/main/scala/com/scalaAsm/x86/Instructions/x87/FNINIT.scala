package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Initialize Floating-Point Unit
// Category: general/control

object FNINIT extends InstructionDefinition("FNINIT") with FNINITImpl

trait FNINITImpl {
  implicit object FNINIT_0 extends FNINIT._0 {
    val opcode: OneOpcode = 0xDB /+ 4
  }
}
