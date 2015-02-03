package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Complement Carry Flag
// Category: general/flgctrl

object CMC extends InstructionDefinition("CMC") with CMCImpl

trait CMCImpl {
  implicit object CMC_0 extends CMC._0 {
    val opcode: OneOpcode = 0xF5
  }
}
