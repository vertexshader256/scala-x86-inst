package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Partial Tangent
// Category: general/trans

trait FPTAN extends InstructionDefinition {
  val mnemonic = "FPTAN"
}

object FPTAN extends FPTAN with FPTANImpl

trait FPTANImpl {
  self: FPTAN =>
  implicit object FPTAN_0 extends _0 {
    val opcode: OneOpcode = 0xD9 /+ 6
    override def hasImplicitOperand = true
  }
}
