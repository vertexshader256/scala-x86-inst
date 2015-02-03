package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Exchange Register Contents
// Category: general/datamov

object FXCH extends InstructionDefinition("FXCH") with FXCHImpl

trait FXCHImpl {
  implicit object FXCH_0 extends FXCH._0 {
    val opcode: OneOpcode = 0xD9 /+ 1
    override def hasImplicitOperand = true
  }
}
